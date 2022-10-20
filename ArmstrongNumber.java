import java.util.Scanner;

public class ArmstrongNumber {
	static boolean isArmstrong(int number)   
	{   
	int temp, digits=0, last=0, sum=0;   
	temp=number;   
	while(temp>0)    
	{   
	temp = temp/10;   
	digits++;   
	}   
	temp = number;   
	while(temp>0)   
	{   
	last = temp % 10;   
	sum +=  (Math.pow(last, digits));   
	temp = temp/10;   
	}  
	if(number==sum)   
	return true;      
	else return false;   
	}   
	public static void main(String args[])     
	{     
	int num;   
	Scanner sc= new Scanner(System.in);  
	System.out.print("Enter the limit: ");  
	num=sc.nextInt();  
	System.out.println("Armstrong Number up to "+ num + " are: ");  
	for(int i=0; i<=num; i++)  
	if(isArmstrong(i))  
	System.out.print(i+ ", ");  
	}   
}
