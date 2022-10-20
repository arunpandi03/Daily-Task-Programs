
public class NonRepeatingLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name="saravanan";
       int size=name.length();
       char array[]=name.toCharArray();
       for(int i=0;i<size;i++) {
    	   for(int j=i+1;j<size;j++) {
    		   if(name.charAt(i)!=name.charAt(j)) {
    			   System.out.print(name.charAt(i));
    		   }
    		   else {
    			   //System.out.print(name.charAt(i));
    				   
    			   }
    				  
    		   }
    	   }
       }
	}


