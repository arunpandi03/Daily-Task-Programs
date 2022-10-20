
public class IntegerPalindrome {
	public static void main(String args[]){  
		  int remaining,sum=0,temp;    
		  int number=454;  
		  
		  temp=number;    
		  while(number>0){    
		   remaining=number%10;   
		   sum=(sum*10)+remaining;    
		   number=number/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  

