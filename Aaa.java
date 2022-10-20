import java.util.Scanner;

public class Aaa extends Thread {
	public void run() {
		meth(5, 10);
	}

	static void meth(int a, int b) {
		int c = a + b;
		System.out.println("Addition : " + c);
	}

}

class Subtraction extends Thread {
	public void run() {
		meth(5, 10);
	}

	static void meth(int a, int b) {
		int c = a - b;
		System.out.println("Subtraction : " + c);
	}
}

class Multiplication extends Thread {
	public void run() {
		meth(5, 10);
	}

	static void meth(int a, int b) {
		int c = a * b;
		System.out.println("Muliplication : " + c);
	}

}

class Division extends Thread {
	public void run() {
		meth(5, 10);
	}

	static void meth(int a, int b) {
		int c = a / b;
		System.out.println("Division : " + c);
	}
}

class Bbb {
	public static void main(String[] args) throws InterruptedException {
		Aaa N = new Aaa();
		Subtraction N1 = new Subtraction();
		Multiplication N2 = new Multiplication();
		Division N3 = new Division();
		N.setPriority(8);
		N1.setPriority(2);
		N2.setPriority(1);
		N3.setPriority(4);
		System.out.println(N.getPriority() + "\n" + N1.getPriority() + "\n" + N2.getPriority() + "\n" + N3.getPriority());
		System.out.println(Thread.currentThread().getName());
		N.start();
		Thread.sleep(2000);
		N1.start();
		N2.sleep(10000);
		System.out.println(N2.toString());
		System.out.println(N1.isAlive());
		N2.start();
		N3.start();
		

	}
}