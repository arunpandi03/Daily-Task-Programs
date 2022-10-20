
public class ReverseString {
	public static void main(String args[]) {
		String s1 = "welcome to teleapps";
		String s2 ="";
		String s3="";
	//	char c=' ';
		for (int i =s1.length()-1;i>=0; i--) {
			if(s1.charAt(i)==' ') {
				s2=" "+s3+" "+s2;
			}else {
				s3=s3+s1.charAt(i);
			}
			
		}
		System.out.println(s3+(s2));
	}
	  
}
