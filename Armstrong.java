package LEARNJAVA;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int a=224;
		int sum=0;
		
		
		while (a>0)
		{
			int n=a%10;
			 sum= (n*n*n) +sum;
			a=a/10;
			
		
		}
		if(sum==a)
		{
			System.out.println("This is an armstrong no.");
		}
		else
		{System.out.println("This is not an armstrong no.");
			
		}
	}

	}


