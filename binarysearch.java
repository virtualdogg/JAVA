package LEARNJAVA;

 
import java.util.Arrays;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k,l = 0;
		j=539;
		int[] sd = {10, 20, 30, 40,12,63,59,566,78,15,48,6,5,85};
	
		k=sd.length;
		
		//System.out.println(sd[0]);
		Arrays.sort(sd);
		/*k=sd.length;
			if(j==sd[sd.length/2])
			{
				System.out.println("The object found at"+ (sd.length/2));
			}
			else if(j<sd[sd.length/2])
			{
				for(i=0;i<sd.length/2;i++)
				{
					if(j==sd[i])
					{
						System.out.print("FOUND AT "+ i +"location");
						break;}
				}
					
			}
			else if(j>sd[sd.length/2])
			{
				for(i=sd.length/2;i<sd.length;i++)
				{
					if(j==sd[i])
					{
						System.out.print("FOUND AT "+ i +"location");
						break;
					}
				}*/
	
		while(j<sd[k-1])
		{
			if(j==sd[k/2])
			{
				System.out.print("the no. found at location"+k/2);
			}
			l=k;
			
			k=k/2;
			if(j>sd[k])
			{
				break;
			}
		}
			if(j>sd[k])
			{
				for(i=k;i<l;i++)
				{
					if(j==sd[i])
					{
						System.out.print("FOUND AT LOCATION "+i);
						break;
						}
				
				}
			
			
			}
				
			}
		}