package LEARNJAVA;

public class primeno111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int i,j,k;
	for(i=2;i<=100;i++)
	{k=0;
		for(j=1;j<=i/2;j++)
		{
			if(i%j==0)
			{
				k++;
			}
		}
		if(k==1)
		{
			System.out.println(i+ "is  a prime no.");
		}
	}
	
	}

}
