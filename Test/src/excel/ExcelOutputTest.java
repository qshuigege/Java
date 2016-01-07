package excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelOutputTest {
	public static void main(String[] args) {
		//第一步，创建一个workbook，对应一个Excel文件 
		HSSFWorkbook wb = new HSSFWorkbook();
		//第二步，在workbook中添加一个sheet,对应Excel文件中的sheet ，这里可建多个sheet页
		HSSFSheet sheet = wb.createSheet("MySheet");
		sheet.autoSizeColumn(1);//设置每个单元格宽度根据字多少自适应
		HSSFCellStyle style = wb.createCellStyle();
//		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);//创建一个居中格式
		HSSFFont font = wb.createFont();
		font.setFontHeightInPoints((short)13);//设置字体大小
		style.setFont(font);//将该字体样式放入style这个样式中，其他单元格样式也是这么加的，这里只是给一个例子
		style.setBottomBorderColor(HSSFCellStyle.BORDER_DOUBLE);//设置单元格下边框
		style.setBorderLeft(HSSFCellStyle.BORDER_DOUBLE);//左
		style.setBorderRight(HSSFCellStyle.BORDER_DOUBLE);//右
		style.setBorderTop(HSSFCellStyle.BORDER_DOUBLE);//上
		
		HSSFRow rowHead = sheet.createRow(0);//创建第一行
		
		HSSFCell cellHead = rowHead.createCell(0);//创建第一行第一个单元格
		cellHead.setCellValue("这是一个表头");//在该单元格内输入内容
		
		
		
		
	}
}
