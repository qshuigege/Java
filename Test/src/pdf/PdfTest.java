package pdf;

import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfTest {
	public static void main(String[] args) throws Exception {
		Document doc = new Document();
		PdfWriter.getInstance(doc, new FileOutputStream("D:\\pdf_test.pdf"));
		doc.open();
		doc.add(new Paragraph("Hello World!"));
		doc.close();
	}
}
