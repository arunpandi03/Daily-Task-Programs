import java.util.*;

public class DubRemove {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("raghul");
		list.add("selva");
		list.add("tamil");
		list.add("selva");
		list.add("arun");
		
		System.out.println(list);
		for(int i=0;i<list.size();i++){
	        for(int j=i+1;j<list.size();j++){
	            if(list.get(i).equals(list.get(j))){
	                list.remove(j);
	                //j--;
	            }
	        }
	    }	  
		list.remove("tamil");
		Collections.sort(list);
		
	      System.out.println(list);
	      Collections.reverse(list);
	      System.out.println(list);
}
}
