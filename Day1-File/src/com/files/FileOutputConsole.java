package com.files;
import java.io.*;
public class FileOutputConsole {
	public static void main(String[] args) {		
			String data = "Welcome to Java Portal!!!Have a Happy Learning";
			try {
			FileOutputStream output = new FileOutputStream("C:\\Users\\Sripoornima\\Desktop");
			byte[] array = data.getBytes();
			// Writes byte to the file
			output.write(array);
			output.close();
			}
			catch(Exception e) {
			System.out.println(e); //Exception details
			}
			}
	}