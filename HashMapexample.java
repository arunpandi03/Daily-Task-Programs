package Gayathri;
import java.util.*;
public class HashMapexample {

	public static void main(String[] args) {      
		HashMap<String,Integer> hm=new HashMap<>();
		HashMap<String,Integer> h=new HashMap<>();
		hm.put("gayathri", 23);
		hm.put("guru", 30);
		hm.put("ranjith", 25);
		hm.put("illakiya", 25);
		hm.put("arun", 22);
		hm.put("gayathri", 23);
		hm.put(null, null);
		hm.put(null, null);
		h.putAll(hm);
		System.out.println(hm.containsKey("arun"));
		System.out.println(hm.containsValue(22));
		System.out.println(hm.equals(h));
		System.out.println(hm.hashCode());
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());
		System.out.println(hm.toString());
		System.out.println(hm.get("guru"));
		System.out.println(hm.getClass());
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		System.out.println(hm.entrySet());
		System.out.println(hm.clone());
		System.out.println();
		
		System.out.println(hm);
		System.out.println(h);
		
	}

}
