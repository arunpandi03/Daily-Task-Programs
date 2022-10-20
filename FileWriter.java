import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileWriter {
	  public static void main(String args[]){ 
		  Scanner r = new Scanner(System.in);
		  System.out.println("enter the string :");
		  String s=r.nextLine();
          try{    
            FileOutputStream fos=new FileOutputStream("C:\\Program Files\\Apache Software Foundation\\Tomcat 8.5\\webapps\\raghul\\FileWriter.txt");    
            //String s="Java was created at Sun Microsystems, Inc., where James Gosling led a team of researchers in an effort to create a new language that would allow consumer electronic devices to communicate with each other. Work on the language began in 1991, and before long the team's focus changed to a new niche, the World Wide Web"; 
            DataOutputStream data = new DataOutputStream(fos);  
            byte b[]=s.getBytes();   
            data.write(b);    
            data.close(); 
            fos.close();
            System.out.println("success...");    
           }catch(Exception e){
        	   System.out.println(e);
        	   }    
     }    

}
