package filehandling;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class FileReading {

	public static void main(String[] args) throws FileNotFoundException {
             File file =new File("C:\\Users\\eclipse-workspace\\CoreJava\\src\\filehandling\\FileIO");
             try {
             Scanner reader =new Scanner(file);
             while (reader.hasNextLine()) {
            	 System.out.println(""+reader.nextLine());
             }

             }
             catch(Exception e){
            	 System.out.println(e);
             }
	}

}
