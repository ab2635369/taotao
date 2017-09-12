package com.taotao.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

public class TestFtp {

	public static void main(String[] args) throws SocketException, IOException {

		FTPClient ftpClient = new FTPClient();
		ftpClient.connect("192.168.162.128",21);
		ftpClient.login("ftpuser", "ftpuser");
		FileInputStream fileInputStream = new FileInputStream(new File("D:\\Koala.jpg"));
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/images");
		ftpClient.storeFile("123.jpg", fileInputStream);
		fileInputStream.close();
		ftpClient.logout();
		
	}

}
