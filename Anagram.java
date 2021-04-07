package LEARNJAVA;


import java.util.Arrays;


public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String a = "RAAMAR";
	String b = "MAARAR"; 


char[] ar = a.toCharArray();
Arrays.sort(ar);
String ah = String.valueOf(ar);

char[] br = b.toCharArray();
Arrays.sort(br);
String bh = String.valueOf(br);

//System.out.println(ah);
//System.out.println(bh);

if(ah.equals(bh))
{
	System.out.println("These are Anagrams");
	
}
else 
{
	System.out.println("These are not anagram");
}
}
}