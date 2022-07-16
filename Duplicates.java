package WEEKLY.ASSSIGNMENTS;

public class Duplicates {

	public static void main(String[] args) {
		int[] arr = {93,18,10,42,18,56,78,89,7,89};	
		int l=arr.length;
		int[] dup = new int[20];
		int count=0;
		int i,j,k=0;
		for(j=0;j<l;j++)
		{
	     for(i=0;i<l;i++)
	      {
	        if(arr[j]==arr[i]&&i!=j)
	        {
	            dup[k]=arr[j];
	            k+=1;
	            count+=1;
	        }
	       }
		}

	    if(count==0)
	     {
	        System.out.println("no duplicates");
	     }
	    else
	     {
	         System.out.println("Duplicates are");
	        for(i=0;i<count;i++)
	        {
	           System.out.println(dup[i]);
	           i+=1;
	        }
	     }

	}

}
