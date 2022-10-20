import java.util.Arrays;

public class TestClass {
public static void main(String[] args) {

String s[]= {"hip","helaao","byed","ian","wd"};
for (int i = 0; i < s.length; i++) {
	for (int j = i+1; j< s.length; j++) {
		if (s[i].length()>s[j].length()) {
			String c=s[i];
			s[i]=s[j];
			s[j]=c;
		}
	}
	
	}
System.out.println(Arrays.toString(s));
for (String string : s) {
	System.out.println(string);
}

String s1="new";
System.out.println(s1.compareTo("ni"));

}
}
