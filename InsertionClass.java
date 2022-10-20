import java.util.Arrays;

public class InsertionClass {
	public InsertionClass(int a[]) {
		for (int i = 1; i < a.length; i++) {
			int j=i-1;
			int key=a[i];
			while (j>=0&&key<a[j]) {
				a[j+1]=a[j];
				j--;
				//System.out.println(Arrays.toString(a));
			}
			a[j+1]=key;
		}
		//System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		int arr[]= {8,9,7,3,2,4};
		InsertionClass i=new InsertionClass(arr);
		System.out.println(Arrays.toString(arr));
	}

}
