package RanjithKumar;

import java.util.Vector;

public class Vector3 
{

	public static void main(String[] args) 
	{
		Vector<Integer> v = new Vector<>();
		
		Vector v1 = new Vector();
		
		v1.add(0);
		v1.add(1);
		v1.add(6);
		v1.add(2);
		v1.add(3);
		v1.add(1);
		v1.add(3);
		System.out.println(v1);
		v.add(1);
		v.add(6);
		v.add(30);
		v.add(null);
		v.add(0, 0);
		System.out.println(v);
		
        v.addElement(4);
        v1.add(4);
        System.out.println(v);
        
        System.out.println(v.size());
       System.out.println(v.capacity());
       v.ensureCapacity(20);
       System.out.println(v.capacity());

       System.out.println(v.contains(6));  
       System.out.println(v.elementAt(3));
       System.out.println(v1.equals(v));
       v.insertElementAt(90, 0);
     System.out.println( v1.lastIndexOf(1)); ;
       Integer [] a = new Integer  [10];
       
   
       v.copyInto(a);
       
       for(  Integer b : a)
       System.out.print(b + " ");
       
       v.insertElementAt(99, 0);
        System.out.println();
       System.out.println(v);
       
   
     
	}
}
