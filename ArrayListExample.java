package Gayathri;

import java.util.*;
import java.util.function.Predicate;
public class ArrayListExample {
	public static void main(String args[])
	{
		
		ArrayList<String> al=new ArrayList<>();	
		ArrayList<String> bl = new ArrayList<>();
		al.add("Arun");
		al.add("Gayathri");
		al.add("Guru");
		al.add("Arun");
		al.add("Maha");
		al.add("Rohini");
		al.add("Guru");
		
		al.add(3, "Mahalakshmi");
		System.out.println(al.contains("4644654"));
		bl.addAll(al);
		System.out.println(bl);
		System.out.println(al.containsAll(bl));
		al.ensureCapacity(5);
		System.out.println(al.equals(bl));     
		System.out.println(al.get(6));
		System.out.println(al.getClass());
		System.out.println(al.hashCode());
		System.out.println(al.indexOf("Arun"));
		System.out.println(al.lastIndexOf("Arun"));
		al.notify();
	    System.out.println(al.parallelStream());
	    al.remove(1);
	    al.remove("Arun");
	    bl.removeAll(bl);
	    //Predicate<String> pr= (al.contains("Arun")); 
	    //al.removeIf(pr);
	   al.clear();
	    

		al.retainAll(al);
		al.set(0, "Arun");
		System.out.println(al.size());
		al.trimToSize();
		
		System.out.println(al);
		System.out.println(bl);
		
	}

}
