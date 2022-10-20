import java.util.Scanner;

public class Gear {

	public void gear(int num)
	{
	switch(num)
	{
	case 1:
		System.out.println("speed limit is : 10km");
		break;
	case 2:
		System.out.println("speed limit is : 30km");
		break;
	case 3: 
		System.out.println("speed limit is : 90 km");
		break;
	
	default :
		System.out.println("please start the bike");
	}
}
}




class Bike extends Gear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the gear");
		int num=sc.nextInt();
		Bike obj = new Bike ();
		obj.gear(num);
		System.out.println("Do you want to reduce your speed: 1.yes,2.no");
		int in=sc.nextInt();
		if(in==1) {
			obj.gear(num - 1);
		}
		else if(in==2) {
			System.out.println("Your speed is normal");
		}

	}

}


