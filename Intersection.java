package WEEKLY.ASSSIGNMENTS;

public class Intersection {

	public static void main(String[] args) {
		int[] arr = {93,18,8,45,7,23,22,10,42};	
		int l=arr.length;
		if(l%2!=0)
		{
			System.out.println("The intersection is");
			System.out.println(arr[l/2]);
		}
		else{
		    System.out.println("no intersection");
		}

	}

}
