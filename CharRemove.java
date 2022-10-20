
public class CharRemove {
public static void main(String[] args) {
	String s1="abccbdabbc";
	char[] s2= {};
	int j=1;
	for (int i = 0; i < s1.length()-1; i++) {
			if (s1.charAt(i)==s1.charAt(i+1)) {
				i=i++;
		}
			else {
				s2[i]=s1.charAt(i);
			}
			
	}
	System.out.println(s2);
}
}
