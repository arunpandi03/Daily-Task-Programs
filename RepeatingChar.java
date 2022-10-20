
public class RepeatingChar {
	public static void main(String[] args) {
		String str = "abccbdabbc";
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (temp.equals("")) {
				temp += str.charAt(i);

			} else {
				if (temp.charAt(temp.length() - 1) == str.charAt(i)) {
					temp = temp.substring(0, temp.length() - 1);
				} else {
					temp += str.charAt(i);

				}
			}
		}
		System.out.println("Result is " + temp);
	}
}
