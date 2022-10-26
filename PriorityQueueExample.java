package Gayathri;
import java.util.*;
public class PriorityQueueExample {

	public static void main(String[] args) {
		Queue<Integer> q = new PriorityQueue<>();
		Queue<Integer> ql = new PriorityQueue<>();
		q.add(8);
		q.add(7);
		q.add(6);
		q.add(4);
		q.add(3);
		q.add(9);
		q.add(9);
		ql.addAll(q);
		System.out.println(q);
		System.out.println(q.contains(9));
		System.out.println(q.containsAll(ql));
		System.out.println(q.equals(ql));
		System.out.println(q.hashCode());
		System.out.println(q.isEmpty());
		System.out.println(q.offer(5));
		System.out.println(q.remove(3));
		System.out.println(q.size());
		System.out.println(q.element());
		System.out.println(q.toString());
		System.out.println(q.getClass());
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.toArray());
		
		System.out.println(q.remove(9));
		
		System.out.println(q.retainAll(ql));
		System.out.println(ql);
		System.out.println(q);
	}

}
