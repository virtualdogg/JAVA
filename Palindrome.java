package LEARNJAVA;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=1221;
	int j,k,q;
	double b;
	double a;
	j=n;
	q=n;
	b=0;
	int length = (int)(Math.log10(n)+1);
	//System.out.println(length);
	
	
/*int r,sum=0;
While(n>0)
{
r=n%10;
sum=sum*10+r;
n=n/10;
}
Chk sum==num
*/
	
	while(j>0)
	{
		k=j%10;
		a=k*(Math.pow(10, (length-1)));
		
		b=b+a;
		length--;
		j=j/10;
	}
	//System.out.println(b);
	
		if(q==b)
		{
			System.out.print("This is a palindrome");
		}
		else
		{
			System.out.print("This is not a palindrome");
		
		}
		
	
	}

}
