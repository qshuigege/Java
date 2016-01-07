package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamTest {
	public static void main(String[] args) {

		File file = new File("\\\\10.1.1.199:8022\\File\\Download\\DOCData\\0003999e-0000-0000-0000-0000a30fbb31\\加盟信息.doc");
		InputStream in = null;
		BufferedInputStream bin = null;
		OutputStream out = null;
		try {
			in = new FileInputStream(file);
			bin = new BufferedInputStream(in);

			out = new FileOutputStream(new File("D:\\pdf_test.pngg"));
			int size = 0;//实际读到的内容 
			byte[] buf = new byte[1024];//把每次读到的内容放到buf中，最多读1KB 
			while ((size = bin.read(buf)) != -1) {
				out.write(buf, 0, size);
			}

			System.exit(0);

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);

		} finally {
			if (bin != null) {
				try {
					bin.close();
				} catch (IOException e) {
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
				}
			}
		}

	}
}
