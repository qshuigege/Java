package io;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;


public class Test {
	public static void main(String[] args) {
		/*

		int bytesum = 0;
        int byteread = 0;

        URL url = null;
		try {
			url = new URL("http://10.1.1.199:8022/File/Download/DOCData/000537ef-0000-0000-0000-0000a31284a2/新建文本文档.txt");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

        try {
            URLConnection conn = url.openConnection();
            InputStream inStream = conn.getInputStream();
            FileOutputStream fs = new FileOutputStream("c:/abc.docx");

            byte[] buffer = new byte[1204];
            int length;
            while ((byteread = inStream.read(buffer)) != -1) {
                bytesum += byteread;
                System.out.println(bytesum);
                fs.write(buffer, 0, byteread);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

		
	*/
		
	
		
		String temp = "Hello, W\r\rorld!";
		temp = temp.replace("\r", "");
		InputStream bin = new ByteArrayInputStream(temp.getBytes());
		OutputStream out = null;
			try {
				out = new FileOutputStream(new File("D:\\jsontest.txt"));
				int size = 0;//实际读到的内容 
				byte[] buf = new byte[1024];//把每次读到的内容放到buf中，最多读1KB 
				while ((size = bin.read(buf)) != -1) {
					out.write(buf, 0, size);
				}

				//System.exit(0);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}finally{
				System.out.println("finally");
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
				System.exit(0);
				
			}
	
	}

}
