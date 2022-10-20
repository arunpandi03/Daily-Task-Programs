
public class Element {
public static void main(String[] args) {
	int[] a= {1,2,2,3,3,4,4,2,6,7,7,8};
	int count;
	for (int i = 0; i < a.length; i++) {
		count=1;
		for (int j = i+1; j < a.length; j++) {
			if (a[i]==a[j]) {
				count++;
				a[j]=0;
				
			}
		}
		if (a[i]!=0) {
			System.out.println(a[i]+"elements:"+count);
		}
	}
}
}
