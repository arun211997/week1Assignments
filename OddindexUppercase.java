package WEEKLY.ASSSIGNMENTS;

public class OddindexUppercase {

	public static void main(String[] args) {
		     String str = "testleaf";
		     char[] arr = str.toCharArray();
		     int size = str.length();
		     int i;
		     for(i=0;i<size;i++)
		      {
		        arr[i+1] = Character.toUpperCase(arr[i+1]);
		        System.out.print(arr[i]);
		        System.out.print(arr[i+1]);
		        i=i+1;
		      }

	}

}
