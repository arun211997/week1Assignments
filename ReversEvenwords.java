package WEEKLY.ASSSIGNMENTS;

public class ReversEvenwords {

	public static void main(String[] args) {
		String str = "testleaf";
		char[] arr = str.toCharArray();
		char[] arr2 = new char[10];
		int i,j=0;
		int size = str.length();
		int l1=size;
		System.out.println("Before Reverse even words");
		System.out.println(str);
		for(i=0;i<l1/2;i++)
		{
		  arr2[i] = arr[size-1];
		  arr2[i]=Character.toUpperCase(arr2[i]);
		  size-=2;
		}
		 System.out.println("After Reverse even words");
		for(i=0;i<l1/2;i++)
		{
		    System.out.print(arr[j]);
		    System.out.print(arr2[i]);
		    j=j+2;
		}
		
	}

}
