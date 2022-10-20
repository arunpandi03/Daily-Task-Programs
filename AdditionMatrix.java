import java.util.Arrays;
import java.util.HashMap;

public class AdditionMatrix {

    AdditionMatrix(int a[][],int b[][]){
    	int j=0;
    	int c[][]=new int[2][2];
    	for (int i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				c[i][j]=a[i][j]*b[i][j];
			}
		}
    	for (int i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.print(c[i][j]+" ");
			}
		}
    	
}
    public static void main(String[] args) {
    	int a[][]= {{1,2},{2,3}};
     	int b[][]={{1,2},{2,3}};
		AdditionMatrix s=new AdditionMatrix(a, b);
		
	}
    

}