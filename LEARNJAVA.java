package LEARNJAVA;

import java.util.ArrayList;

public class LEARNJAVA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* A[]=12345678 
	Output required 15263748*/
		
		
		int[] i = new int[]{1,2,3,4,5,6,7,8};
		
		int j,l,a,b;
		
		l=i.length;
		int fr[]=new int[l/2];

		int pr[]=new int[l/2];
		
		ArrayList<Integer> gar = new ArrayList<Integer>();
		//System.out.print(l);
		
		
		
		/*while(j<l/2)
		{
			fr[j]=i[b];
			m=j+(l/2);
			n=j+1;
			while(n==j+1)
			{
				fr[n]=i[m];
			
			n++;
			}
			
			
			j=j+2;
			b++;
			
		}*/
		for(j=0;j<=l/2-1;j++)
		{
			fr[j]=i[j];
		}
		for(b=0;b<=l/2-1;b++)
		{
			pr[b]=i[b+(l/2)];
			
		}
		for(j=0;j<=l/2-1;j=j+1)
		{
				
				gar.add(fr[j]);
				gar.add(pr[j]);
		}
		
		for(a=0;a<(i.length);a++) {
		System.out.print(gar.get(a));
		}
	}


}
