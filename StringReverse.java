import java.util.Arrays;
import java.util.Scanner;

public class StringReverse {
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    System.out.print("Original string : ");
	 
	    String Str = s.nextLine();
	 
	    String A[] = Str.split(" ");
	    String Str1 = "";
	    //System.out.println(Arrays.toString(A));
	    for (int i = 0; i < A.length; i++) 
	    {
	      String B = A[i];
	      //System.out.println(B);
	      String Str2 = "";
	      for (int j = B.length()-1; j >= 0; j--) {
	        Str2 = Str2 + B.charAt(j);
	        //System.out.println(Str2);
	      }
	      Str1 =Str1+ Str2 + " ";
	    }
	 
	    System.out.print("Reversed string : " +Str1);
	  }
}