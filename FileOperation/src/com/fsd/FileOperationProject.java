package com.fsd;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class FileOperationProject 
{



	
	
	static String filename ;
	
	
    public static void main(String[] args) throws IOException
    {
       createAndWriteFile();
       readFile();
       
    	appendStrToFile("C://Users//waz78153//OneDrive - Viavi Solutions Inc//Desktop//JavaTest//"+filename," \n New text added in the end");
       
       //createFileUsingFileOutputStreamClass();
       //createFileIn_NIO();
    
    }
 
    private static void createAndWriteFile() throws IOException
    {
    	System.out.println("Enter the Filename :");
		Scanner sc = new Scanner(System.in);
		 filename  =  sc.nextLine();
          File file = new File("C://Users//waz78153//OneDrive - Viavi Solutions Inc//Desktop//JavaTest//"+filename);
         
   
          FileWriter writer = new FileWriter(file);
          BufferedWriter bw = new BufferedWriter(writer);
          System.out.println();
          System.out.println("File Created with Name : "+filename);
          bw.write("First Line");
          bw.write("\n");
          bw.write("Second Line");
          bw.close();
          System.out.println();
          System.out.println();
    System.out.println("Reading the File Created :");
          //readFile();
    }
	

	public static void readFile()
	{

		System.out.println();
		List l = readFileInList("C://Users//waz78153//OneDrive - Viavi Solutions Inc//Desktop//JavaTest//"+filename); 
		  
	    Iterator<String> itr = l.iterator(); 
	    while (itr.hasNext()) 
	      System.out.println(itr.next()); 
	}
	
public static void appendStrToFile(String fileName, String str)
{
// Try block to check for exceptions
try {


System.out.println();
System.out.println("Adding Text to the Text File : "+str);
// Open given file in append mode by creating an
// object of BufferedWriter class
BufferedWriter out = new BufferedWriter(
new FileWriter(fileName, true));

// Writing on output stream
out.write(str);
// Closing the connection
out.close();

System.out.println();

System.out.println("Reading the File Appended :");

readFile();



}

// Catch block to handle the exceptions
catch (IOException e) 
{

// Display message when exception occurs
System.out.println("exception occurred" + e);
}

}

	
  public static List<String> readFileInList(String fileName) 
  { 
  
    List<String> lines = Collections.emptyList(); //creates an empty list
    try
    { 
      lines = 
       Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8); 
    } 
  
    catch (IOException e) 
    { 
      e.printStackTrace(); 
    } 
    return lines; 
  } 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




}
