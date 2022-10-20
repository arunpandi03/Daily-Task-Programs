
public class Swap {

	private void print(int a) {
		System.out.println("hi"+a);

	}
	public Swap() {
		System.out.println("hi");	
		}
	public Swap(int a) {
		System.out.println("Hi"+a);
	}
	
	public static void main(String[] args) {
		new Swap().print(3);
		int num = 5;
		int numbers = 10;
		int temp;
		temp = num;
		num = numbers;
		numbers = temp;
		System.out.println(num);
		System.out.print(numbers);
		

	}

}