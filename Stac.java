import java.util.*;
public class Stac {

	public static void main(String[] args) {
		Stack<String> animals=new Stack<String>();
		animals.push("dog");
		animals.push("cat");
		animals.push("cow");
		System.out.println(animals);
		String removingElement=animals.pop();
			System.out.println(removingElement);
		
}

}
