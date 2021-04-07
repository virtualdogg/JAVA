package LEARNJAVA;

public class LEARNJAVA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="anshul";
int i,j,k;
j=s.length();
k=0;
for(i=0;i<=j-1;i++)
{
	
	if(s.charAt(i)=='a'||s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' ||s.charAt(i)=='u')
	
	{
		k=k+1;

	}
}

System.out.println (k+"\n No. of Vowels  ");

	}

}
