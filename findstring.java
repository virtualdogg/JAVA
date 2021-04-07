package LEARNJAVA;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class findstring {
	
	static String a ="DETAIL";
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int j =0;
		
		/*WAP How to find if a string is present in a text file?
Write a Java Program to count the number of repetitive words in a string?*/

	      File myObj = new File("E:\\Leet Code\\JAVAprog1.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()){
	        String data = myReader.nextLine();
	        //System.out.println(data);
	        if(data.contains( a))
	        {j++;
	        	System.out.print("String found");
	        }
	        
	        }
	      if(j==0)
	      {
	    	  System.out.println("String not found");
	      }
	      }

	
	        

	}


