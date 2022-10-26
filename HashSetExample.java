package Gayathri;
import java.util.*;
public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Integer> ss=new HashSet<>();
		HashSet<Integer> s=new HashSet<>();
		ss.add(12);
		ss.add(9);
		ss.add(5);
		ss.add(23);
		ss.add(12);
		ss.add(null);
		ss.add(null);
		s.addAll(ss);
		System.out.println(ss.contains(5));
		System.out.println(ss.containsAll(s));
		System.out.println(ss.equals(s));
		System.out.println(ss.hashCode());
		System.out.println(ss.isEmpty());
		System.out.println(ss.size());
		System.out.println(ss.getClass());
		System.out.println(ss.toString());
		System.out.println(ss.toArray());
		System.out.println(ss.parallelStream());
		System.out.println(ss.spliterator());
		System.out.println(ss.stream());
		System.out.println(ss.clone());
		ss.remove(12);
		ss.removeAll(s);
		
		
		
		System.out.println(ss);
		System.out.println(s);
     
	}

}
