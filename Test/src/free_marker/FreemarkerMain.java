package free_marker;

import java.io.File;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import myutils.LogUtils;
import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class FreemarkerMain {
	public static void main(String[] args) throws Exception {
		Configuration cfg = new Configuration();
		try{
		cfg.setDirectoryForTemplateLoading(new File("ftl"));
		Logger.getLogger(FreemarkerMain.class).debug("配置模板目录成功");
		}catch(Exception e){
			Logger.getLogger(FreemarkerMain.class).error("error:"+e);
		}
		cfg.setObjectWrapper(new DefaultObjectWrapper());
		Template temp = cfg.getTemplate("test.ftl");
		Map<String, Object> rootMap = new HashMap<String, Object>();
		rootMap.put("name", "liyh");
//		OutputStreamWriter 
		Writer out = new OutputStreamWriter(System.out);
		temp.process(rootMap, out);
//		out.flush();
	}
}
