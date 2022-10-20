import java.util.Scanner;

public class EBbill implements Commercial1 {
   
	public static void main(String[] args) {
		Commercial1 M;
	//	Residential_cal N= new Residential_cal();

		 M= new EBbill();
		 M= new EBbill();
		Scanner S = new Scanner(System.in);
		System.out.println("Welcome to the Electricity Board :");
		System.out.println("Enter the traiff : ");
		System.out.println("1.Commercial \n 2.Residendial :");
		System.out.println("Enter the traiff input : ");
		int a=S.nextInt();
		if(a==1) {
			M.comm();
		}
	   else if (a==2) {
		M.resi();
		}
	 else {
			System.out.println("wrong input");
	}
	
	}
	static int price;
	static int bill;
	static Scanner S = new Scanner(System.in);
  static int b;
	public void comm() {
		
		
			 System.out.println("enter the unit :");
			 b=S.nextInt();
			if(b<=100) {
				price=b*0;
				System.out.println(price);
			 }
			 else if (b >=101 && b<=200) {
				price=b-100;
				bill=price*3;
				 System.out.println(bill);
			 }
				else if (b >=201 && b <=300) {
					price=b-100;
					bill=price*4;
					
					 System.out.println(bill);
				}
					 else if (b>=301 && b<=400) {
						 price=b-100;
						 bill=price*5;
						 System.out.println(bill);
					 }
					 else {
						 price=b-100;
						 bill=price*6;
						 System.out.println(bill);
			
		}
		}
		
	
	@Override
	public void resi() {
		// TODO Auto-generated method stub
		System.out.println("enter the unit :");
		 b=S.nextInt();
		if(b<=100) {
			price=b*0;
			System.out.println(price);
		 }
		 else if (b >=101 && b<=200) {
			price=b-100;
			bill=price*3;
			 System.out.println(bill);
		 }
			else if (b >=201 && b <=300) {
				price=b-100;
				bill=price*4;
				
				 System.out.println(bill);
			}
				 else if (b>=301 && b<=400) {
					 price=b-100;
					 bill=price*5;
					 System.out.println(bill);
				 }
				 else {
					 price=b-100;
					 bill=price*6;
					 System.out.println(bill);
		
	}
}}


