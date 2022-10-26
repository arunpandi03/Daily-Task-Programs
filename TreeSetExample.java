package Gayathri;
import java.util.*;
public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> ts=new TreeSet<>();
		TreeSet<String> t=new TreeSet<>();
		ts.add("Apple Tree");
		ts.add("Coconut Tree");
		ts.add("Mango Tree");
		ts.add("Orange Tree");
		ts.add("Papaya Tree");
		ts.add("Apple Tree");
		t.addAll(ts);
		System.out.println(ts.ceiling("Orange Tree"));
		System.out.println(ts.contains("Apple Tree"));
		System.out.println(ts.containsAll(t));
		System.out.println(ts.equals(t));
		System.out.println(ts.first());
		System.out.println(ts.hashCode());
		System.out.println(ts.floor("Mango Tree"));
		System.out.println(ts.higher("Coconut Tree"));
		System.out.println(ts.last());
		System.out.println(ts.lower("Mango Tree"));
		System.out.println(ts.size());
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.getClass());
		System.out.println(ts.toArray());
		System.out.println(ts.headSet("Cocunut Tree"));
		System.out.println(ts.stream());
		System.out.println(ts.parallelStream());
		System.out.println(ts.isEmpty());
		ts.remove("Apple Tree");
		t.removeAll(t);
		
		System.out.println(t);
		System.out.println(ts);
	}

}
