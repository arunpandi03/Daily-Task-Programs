import java.util.Stack;

public class DuplicateRemoval {
	public static void main(String[] args) {
		String s="abccbdacc";
		Stack s1=new Stack();
		for (int i = 0; i < s.length()-1; i++) {
			if (s1.peek()==(Object)s.charAt(i)) {
				s1.empty();
			}
			else {
				s1.push(s.charAt(i));
			}
		}
		System.out.println(s1);
	}

}
