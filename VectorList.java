import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VectorList {
	static Scanner scan = new Scanner(System.in);
	static Vector<Integer> Quantity = new Vector<>();
	static Vector<String> Product = new Vector<>();
	public static void main(String[] args) {

		
		Product.add("Apple");
		Product.add("Orange");
		Product.add("Biscuit");
		Product.add("Cakes");
		Product.add("Cool Drinks");
		Product.add("Shirt");
		Product.add("Watch");
		Product.add("pen");
		Product.add("Note");
		Product.add("Mobiles");
		
		Quantity.add(10);
		Quantity.add(7);
		Quantity.add(19);
		Quantity.add(25);
		Quantity.add(24);
		Quantity.add(10);
		Quantity.add(8);
		Quantity.add(52);
		Quantity.add(26);
		Quantity.add(5);
		 Iterator<String> itr=Product.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next()); 
		  }
		  System.out.println("1.purchase \n2.Sales");
		  int t=scan.nextInt();
		  switch(t) {
		  case 1:
			  purchase();
			  break;
		  case 2:
			  Sales();
			  break;
		  }
		 
	
	
}
	public static void Sales() {
		
		System.out.println("enter the product :");
		 String m=scan.next();
		 System.out.println("Enter the Quantity :");
		 int n=scan.nextInt();
		 int r=Product.indexOf(m);
		 int g=Quantity.get(r);
		 int u=g-n;
		 Quantity.set(r, u);
		 System.out.println("take your product "+m+" and your quantity "+n);
	}
	public static void purchase() {
		
		System.out.println("enter the product :");
		 String m=scan.next();
		 System.out.println("Enter the Quantity :");
		 int n=scan.nextInt();
		 int r=Product.indexOf(m);
		 int g=Quantity.get(r);
		 int u=g+n;
		 Quantity.set(r, u);
		 System.out.println("purchase product "+m+" with Quantity " +u);
	}
}
