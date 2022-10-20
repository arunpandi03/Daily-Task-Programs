import java.util.LinkedHashMap;
import java.util.Map;

public class occurence {

	private static int i;
    
	public static void main(String[] args) {
		String str ="123456789987654321";
		//String str1=str.replace(" ", "");
		Map<Character,Integer> mp = new LinkedHashMap();
		for(int i=0;i<str.length();i++) {
		char ch =str.charAt(i);
		if (mp.containsKey(ch)) {
			Integer c = mp.get(ch);
			mp.put(ch, c+1);
		}
		else {
			mp.put(ch,1);
		}
		
	}
		System.out.println(mp);

	}	
	
	}

