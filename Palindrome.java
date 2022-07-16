package WEEKLY.ASSSIGNMENTS;

public class Palindrome {

	public static void main(String[] args) {
			 String str = "madam";
		     char[] arr = str.toCharArray();
		     int size = str.length();
		     int j =str.length();
		     int i,flag=0;
		     char[] temp = new char[15];
		     for(i=0;i<size;i++)
		      {
		        temp[i] = arr[j-1];
		          j=j-1;
		      }
		     for(i=0;i<size;i++)
		     {
		         if(arr[i]==temp[i])
		         {
		             flag=1;
		             continue;
		             
		         }
		         else
		         {
		             break;
		         }
		     }
		     if(flag==1)
		     {
		         System.out.println("This is Palindrome");
		     }
		     else{
		         System.out.println("not palindrome");
		         
		     }
	}

}
