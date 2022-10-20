import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class OuterClass {
int unit;
int price;
void cal() {
	price=unit*0;
	System.out.println("below hundred unit free");
}
		public class innerClass {
	
	 void calculation (int unit) {
		 if(unit<=100) {
			 cal();
		 }
		 else if (unit >=101 && unit<=200) {
			price=unit*2;
			 System.out.println(price);
		 }
			else if (unit >=201 && unit <=300) {
				price=unit*3;
				 System.out.println(price);
		}
	}
	
}
public static void main(String[] args) {
	Scanner n = new Scanner(System.in);
	System.out.println("enter the unit :");
// unit = n.nextInt();
	OuterClass s = new OuterClass();
	OuterClass.innerClass t = s.new innerClass();
	int unit = n.nextInt();
	t.calculation(unit);
	 
}
}
