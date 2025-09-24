package filehandling;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWritting {
	public static void main(String[]args) throws IOException {
		File file=new File("C:\\Users\\eclipse-workspace\\CoreJava\\src\\filehandling\\FileIO");
		try {
		FileWriter fw= new FileWriter(file,true);
		fw.write("this line in this text file is written through file writer..");
		fw.close();
		Scanner reader=new Scanner(file);
		System.out.println("After file writting the content in the file:"+reader.nextLine());
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
