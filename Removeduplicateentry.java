package LEARNJAVA;

import java.util.ArrayList;

public class Removeduplicateentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {1,2,3,3,3,4,4,7,5,5,8,9};
		ArrayList<Integer> m= new ArrayList<Integer>();
		int i,j;
		for(i=0;i<a.length;i++)
		{ 
			int k = 0;
			for(j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					k++;
					break;
					}
				
			}
			if(k==0)
			{
				m.add(a[i]);
			}
		
	
			}
		
		System.out.println(m);
		
	
	}

}
