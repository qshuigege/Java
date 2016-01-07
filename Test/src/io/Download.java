package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Download {
	public static void main(String[] args) throws Exception {
//		String address = "http://10.1.1.199:8022/File/Download/DOCData/0003999e-0000-0000-0000-0000a30fbb31/加盟信息.doc";
		String address = "http://10.1.1.199:8022/File/Download/DOCData/000c3f05-0000-0000-0000-00008a0ff866/副本员工契合度调查问卷-周婷.xlsx";
		String part1 = address.substring(0, address.lastIndexOf("/")+1);
		String part2 = address.substring(address.lastIndexOf("/")+1);
		part2 = URLEncoder.encode(part2, "utf-8");
		address = part1+part2;
		System.out.println(address);
//		address = URLEncoder.encode(address, "utf-8");
//		address = "https://www.baidu.com/img/bdlogo.png";
		URL url = new URL(address);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");//下载要用GET，不要用POST，虽然有的服务器支持POST
//		conn.setDoOutput(true);
//		conn.setDoInput(true);
//		conn.setRequestProperty("Connection", "Keep-Alive");
//		conn.setRequestProperty("Accept","image/gif, image/jpeg, image/pjpeg, image/pjpeg, application/x-shockwave-flash, application/xaml+xml, application/vnd.ms-xpsdocument, application/x-ms-xbap, application/x-ms-application, application/vnd.ms-excel, application/vnd.ms-powerpoint, application/msword, */*");
//		conn.setRequestProperty("Content-Length", "0");
		conn.setRequestProperty("Charset", "UTF-8");
		conn.connect();
//		int fileSize = conn.getContentLength();
		InputStream in = null;
		BufferedInputStream bin = null;
		OutputStream out = null;
		try {
			in = conn.getInputStream();
			bin = new BufferedInputStream(in);

			out = new FileOutputStream(new File("D:\\pdf_test.gifff"));
			int size = 0;//实际读到的内容 
			byte[] buf = new byte[1024];//把每次读到的内容放到buf中，最多读1KB 
			while ((size = bin.read(buf)) != -1) {
				out.write(buf, 0, size);
			}

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

		System.exit(0);

	}
}
