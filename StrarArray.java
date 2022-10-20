
public class StrarArray {

	public static void main(String[] args) {
		int num=5;
		for (int i = 0; i < num; i++) {
			if (i%2==0) {
			for (int k = 0; k < num-i; k++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			
	}
			
	}
		for (int i = 1; i <num; i++) {
			if (i%2==0) {
				
		for (int k = 0; k <= i; k++) {
			System.out.print(" ");
		}
		for (int j = num-i; j >0; j--) {
			System.out.print("* ");
		}
		System.out.println();
		}
		}
	}
}

