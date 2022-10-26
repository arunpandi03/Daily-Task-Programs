package Gayathri;

import java.util.*;

public class LinkedListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ls=new LinkedList<Integer>();
		LinkedList<Integer> ln=new LinkedList<Integer>();
		ls.add(19);
		ls.add(5);
		ls.add(26);
		ls.add(9);
		ls.add(20);
		ls.add(5);
		ln.addAll(ls);
		ls.addFirst(69);
		ls.addLast(23);
		ls.add(null);
		ls.add(null);
		System.out.println(ls.contains(1));
		System.out.println(ls.containsAll(ln));
		System.out.println(ls.element());
		System.out.println(ls.equals(ln));
		System.out.println(ls.get(5));
		System.out.println(ls.getClass());
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		System.out.println(ls.hashCode());
		System.out.println(ls.indexOf(20));
		System.out.println(ls.lastIndexOf(5));
		System.out.println(ls.offer(5));
		System.out.println(ls.offerFirst(5));
		System.out.println(ls.offerLast(5));
		System.out.println(ls.size());
		System.out.println(ls.peek());
		System.out.println(ls.peekFirst());
		System.out.println(ls.peekLast());
		System.out.println(ls.poll());
		System.out.println(ls.pollLast());
		System.out.println(ls.pop());
		System.out.println(ls.set(1, null));
		System.out.println(ls.toString());
		System.out.println(ls.toArray());
		System.out.println(ls.stream());
		System.out.println(ls.subList(0, 5));
		System.out.println(ls);
		System.out.println(ln);		
	}

}
