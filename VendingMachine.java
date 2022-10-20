                                                              import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class VendingMachine {

	public static void main(String[] args) {
		int ballance=0;
		System.out.println("all the items...");
		Map<String,Integer> mp=new LinkedHashMap();
		mp.put("chips",10);
		mp.put("cake",10);
		mp.put("chocolate",10);
		mp.put("biscuit",10);
		mp.put("apple",20);
		mp.put("orange",20);
		mp.put("mango",20);
		mp.put("pineapple",20);
		mp.put("eggbuff",30);
		mp.put("vegbuff",30);
		mp.put("panipuri",30);
		mp.put("masalapuri",30);
		System.out.println(mp);
		Scanner s= new Scanner(System.in);
		System.out.println("enter a amount : ");
		int amount=s.nextInt();
		if(amount<10) {
			System.out.println("amount is not sufficien :");
		}
		else {
			System.out.println("product under your amount :");
			Set<Entry<String,Integer>> entrySet =mp.entrySet();
			for (Entry<String,Integer> entry : entrySet) {
				if (entry.getValue()<=amount) {                                      
					System.out.println(entry);
				}
			}
			System.out.println("enter a product to buy :");
			String prod=s.next();
			for(Entry<String,Integer> entry : entrySet) {
				if (entry.getKey().equalsIgnoreCase(prod)) {
					System.out.println(entry.getKey()+ "is purchased product ");
					ballance=amount-mp.get( prod);
					System.out.println("your balance is "+ballance);
					
				}
			}
		}
		
			
	}

}
