package LEARNJAVA;

public class SWAPSTRINGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="anshul";
		String g="Garvit Jain";
		String c=a+g;
		int l1= a.length();
		int l2= g.length();
		int l3= l1+l2-1;
		
		
		a= c.substring(l1,l3+1);
		g= c.substring(0,l1);
		
		System.out.println("String a for you is   "+ a);
		System.out.println("String g for you is  "+g);		
		
		
			
		
		
	
	}

}
