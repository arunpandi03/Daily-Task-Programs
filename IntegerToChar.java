import java.util.Scanner;

public class IntegerToChar {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number : ");
		int n,Digit1,Digit2;
		String a[] = {" "," ","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","hundred"};
		String b[] = {" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","eighteen","ninteen"};
		n=s.nextInt();
		if((n<=-1)||(n>=101))
		{
			System.out.println("wrong input");
		}
		else if((n>=1)&&(n<=19))
{
	System.out.println(b[n]);
}
else
{
	Digit1 = n/10;
	Digit2 = n%10;
	System.out.println(a[Digit1]+" "+b[Digit2]);
}
	}
}
