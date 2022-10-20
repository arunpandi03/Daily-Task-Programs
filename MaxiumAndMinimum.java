import java.util.Arrays;
import java.util.Iterator;

public class MaxiumAndMinimum {

	public static void main(String[] args) {
	
        int a[][] = {{2,5,7,9},{3,6,8,1,5}};
        int b[]=new int[9];
            int k=0;
        for (int i=0; i<a.length; i++)
        {
            for (int j=0; j<a[i].length; j++)
            {
            	b[k]=a[i][j];
            	k++;
            }}
        for (int i=0; i<b.length; i++)
        {
            for (int j=i+1; j<b.length; j++)
            {
            	if(b[i]>b[j])
                {
                    int c=b[i];
                    b[i]=b[j];
                    b[j]=c;
                }
            }
        }
        System.out.println(Arrays.toString(b));
            }
        }
	


