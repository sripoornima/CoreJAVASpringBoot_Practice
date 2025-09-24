package com.files;
/*
 * USING BELOW PACKAGES WE ARE NOW GOING TO EXPLORE SOME OF THE BASIC FILE OPERATION BY USING INBUILT FUNCTIONS 
 *
 * 
 * @author Sripoornimadevi T S
 * @version 0.1
 * @since 2.01.2025
 * 
 * 
 * **/
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Filepath {
	public static void main(String[] args) throws IOException  {
     Path p1=Paths.get("C:\\Users\\Sripoornima\\file.txt");
     Path p2=Paths.get("Sripoornima\\file.txt");
     if(!Files.exists(p1)) {
    	 Files.createDirectory(p1);         
    	 System.out.println("Original File CReated");    	 
     }
     else {
         System.out.println("Directory already exists");
     }
     System.out.println("Directory Count in your path: "+p1.getNameCount());
     System.out.println("subpath of the directory: "+p1.subpath(0, 2));
     System.out.println("Name of the file: "+p1.getFileName()); 
     System.out.println("Root of the Filepath: "+p1.getRoot());
     System.out.println("Normalise: "+p1.normalize());
     System.out.println("Parent file: "+p1.getParent());
     System.out.println("Absolute Path: "+p1.toAbsolutePath());// if we give path in a different disk it goes first path of ur wrk space n then to ur file path 
     System.out.println("Check is Absolute path: "+ p2.isAbsolute());
     //System.out.println("Symbolic link: "+p1.createSymbolicLink());
     Path symLinkPath= Paths.get("C:\\kiki.txt");
     Path filepaths=Paths.get("kiki.txt");
     if(!Files.exists(p1)) {
    	 Files.createFile(p1);         
    	 System.out.println("Original File CReated");    	 
     }
     else {
         System.out.println("Directory already exists");
     }
    
     
     try {
     Files.createSymbolicLink(symLinkPath,p1 );
     System.out.println("Symbolicpath: "+symLinkPath);
     } catch (IOException x) {
     System.err.println(x);
     } catch (UnsupportedOperationException x) {
     // Some file systems do not support symbolic links.
     System.err.println(x);
	}
	}

}
