package Gayathri;
import java.util.*;  
//import java.util.ArrayDeque;

public class DequeueExample {

	public static void main(String[] args) {
		
		   Deque<String> dq = new ArrayDeque<String>();  
		   Deque<String> d = new ArrayDeque<String>();  
		   dq.add("cannada");
		   dq.add("America");
		   dq.add("India");
		   dq.add("Newyork");
		   dq.add("Malasiya");
		   dq.add("Singapore");
		   dq.add("India");	
		   d.addAll(dq);
		   dq.addFirst("Italy");
		   dq.addLast("Germany");
		   System.out.println(dq.containsAll(d));
		   System.out.println(dq.element());
		   System.out.println(dq.equals(d));
		   System.out.println(dq.getFirst());
		   System.out.println(dq.getLast());
		   System.out.println(dq.hashCode());
		   System.out.println(dq.isEmpty());
		   System.out.println(dq.peek());
		   System.out.println(dq.peekFirst()); 
		   System.out.println(dq.peekLast());
		   System.out.println(dq.poll());
		   System.out.println(dq.pollFirst());
		   System.out.println(dq.pollLast());
		   System.out.println(dq.pop());
		   System.out.println(dq.size());
		   System.out.println(dq.getClass());
		   System.out.println(dq.toString());
		   System.out.println(dq.toArray());
		   dq.push("china");
		   dq.remove();
		   dq.removeAll(dq);
		   
		   System.out.println(dq);
		   System.out.println(d);
	}

}
