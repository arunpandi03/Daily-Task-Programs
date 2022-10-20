
public class InsertionParameter {
	public InsertionParameter(int[] array) {
		System.out.println("Before Sorting");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

			for (int i = 1; i < array.length; i++) {
				int key = array[i];
				int j = i - 1;
				while (j >= 0 && key < array[j]) {
					array[j + 1] = array[j];
					--j;
				}
	
				array[j + 1] = key;
			}
		System.out.println();
		System.out.println("After Sorting");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

	}

	public static void main(String args[]) {
		int[] array = { 9, 5, 1, 4, 3 };
		InsertionParameter obj = new InsertionParameter(array);

	}
}
