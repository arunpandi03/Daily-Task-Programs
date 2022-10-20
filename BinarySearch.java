
public class BinarySearch {
public static void binarysearch(int Array[],int first,int last,int key) {
	int midlepoint = (first+last)/2;
	while (first<=last) {
		if(Array [midlepoint]<key) {
			first = midlepoint+1;
		}
		else if (Array[midlepoint]==key) {
			System.out.println("element is fount at index :"+midlepoint);
			break;
		}
		else {
			last = midlepoint-1;
		}
		midlepoint =(first+last)/2;
	}
	if (first>last) {
		System.out.println("element is not found");
	}
}
public static void main(String args[]) {
	int Array[] = {10,20,30,40,50};
	int key = 20;
	int last =Array.length-1;
	binarysearch(Array,0,last,key);
}

		}
	


