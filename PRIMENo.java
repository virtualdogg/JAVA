package LEARNJAVA;

public class PRIMENo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n= 130;
		int i,k;
		k=0;
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
			k++;	
			}
		}
		if(k!=0)
		{
			System.out.println(n +" is not a prime number");
			
		   
		}
		else {
			System.out.println(n +"is  a prime number");
		
		}
	}

}
