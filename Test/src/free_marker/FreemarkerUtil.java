package free_marker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import myutils.LogUtils;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class FreemarkerUtil {
	/**
	 * 获得Template对象
	 * @param name
	 * @return
	 */
	public Template getTemplate(String name) {
		Template tplt = null;
		try {
			// 通过Freemarker的Configuration读取ftl
			Configuration conf = new Configuration();
			conf.setClassForTemplateLoading(this.getClass(), "ftl");
			LogUtils.LOGGER.debug("初始化freemarker模板目录");
			tplt = conf.getTemplate(name);
		} catch (IOException e) {
			LogUtils.LOGGER.error("freemarker初始化失败！", e);
		}
		return tplt;
	}
	
	/**
	 * 控制台输出文件内容
	 * @param name
	 * @param rootMap
	 */
	public void print(String name, Map<String, Object> rootMap){
		try {
			Template tplt = this.getTemplate(name);
			tplt.process(rootMap, new PrintWriter(System.out));
		} catch (TemplateException | IOException e) {
			LogUtils.LOGGER.error("将模板内容输出到文件异常！", e);
		}
	}
	
	/**
	 * 将替换后的模板内容输出到文件
	 * @param name
	 * @param rootMap
	 * @param outFile
	 */
	public void fprint(String name, Map<String, Object> rootMap, String outFile){
		FileWriter out = null;
		try {
			out = new FileWriter(new File("E:\\works\\workspace\\Test\\ftl\\"+outFile));
			Template tplt = this.getTemplate(name);
			tplt.process(rootMap, out);
		} catch (IOException e) {
			LogUtils.LOGGER.error("模板目录未找到！", e);
		} catch (TemplateException e) {
			LogUtils.LOGGER.error("ptlt.process()异常", e);
		}finally{
			try{
			if (out!=null) {
				out.close();
			}
			}catch(Exception e){
				LogUtils.LOGGER.error("FileWriter流关闭失败！", e);
			}
		}
		
	}
}
