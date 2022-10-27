package RanjithKumar;

import java.util.Stack;

public class Stack4 
{

	public static void main(String[] args)
	
	{
		Stack s = new Stack();
		
		s.push(100);
		s.push(1000);
		s.push(10000);
		s.push(100000);
		s.push(200);
		s.push(2000);
		s.push(20000);
		s.push(200000);
		
		System.out.println(s);
		s.pop();
		s.pop();
		System.out.println(s);
		System.out.println(s.get(0));
		System.out.println(s.peek());
		System.out.println(s.size());
		s.trimToSize();
		System.out.println(s.capacity());
		System.out.println(s.elementAt(0));
		System.out.println(s.firstElement());
		System.out.println(s.indexOf(1000));
		System.out.println(s.lastElement());
		System.out.println(s.set(0, 900));
		System.out.println(s.isEmpty());
		System.out.println(s.removeElement(900));
		System.out.println(s.get(0));
		System.out.println(s.search(2000));
		System.out.println(s);
	
		

	}

}
