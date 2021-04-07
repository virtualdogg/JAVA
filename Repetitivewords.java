package LEARNJAVA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Repetitivewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a= "asmmmmmpdasdxxxxxxxxxx";
		//Converting string to Array
		char[] b= a.toCharArray();
		//Sorting the array
		Arrays.sort(b);
		System.out.println(b);
		//Declare integer array
		//ArrayList<int[]> c = new ArrayList<int[]>();
		
		
		
		
		int j= a.length();
		int i,k;
		i=0;
		k=1;
		
		
		while(i<(a.length()-2))
			
		{
			while(b[i]==b[i+1])
		{
			k=k+1; //2
			if(i==j-2)
			{
				break;
			}
			i++;
			
		}
		
		
		if(k==1)
		{
		System.out.println(b[i]+" is not repeative and is present only 1 time");
		}
		else if(k!=1)
		{
		System.out.println( b[i]+" is repeative and is present "+ k +" times");
		
		}
		
		
		
		if(i!=j-1)
		{	i=i+1;	
			if(b[i]!=b[i-1]) 
			{
				k=1;
			}

			
		}
		//System.out.println (i);
		//System.out.println (j);

		}
				
		
		
		
		
		  
		  
	}

	
	}


