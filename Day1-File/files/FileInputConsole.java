package com.files;

import java.io.*;

public class FileInputConsole {
	public static void main(String[] args) {
		try {
			FileInputStream input= new FileInputStream("C:\\Users\\Sripoornima\\Desktop\\file.txt");
			System.out.println("Data in the file");
			int i=input.read();
					while(i!=-1) {
						System.out.print((char)i);
						i=input.read();
					}
		input.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
