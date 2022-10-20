import java.io.DataInputStream;
import java.io.FileInputStream;

public class FileReader {

	public static void main(String[] args) {
		 try{    
	            FileInputStream fis=new FileInputStream("C:\\Program Files\\Apache Software Foundation\\Tomcat 8.5\\webapps\\raghul\\FileWriter.txt");
	            DataInputStream inst = new DataInputStream(fis); 
	            int count = fis.available(); 
	            System.out.println(count);
	            byte[] ary = new byte[count];  
	            inst.read(ary); 
	            for (byte bt : ary) {  
	                char k = (char) bt;
	                System.out.print(k);
	            }
	            //int i=fis.read();
	            //int i=0;    
	            //while((i=fis.read())!=-1)  
	            //}
	            inst.close();
	            fis.close();    
	          }catch(Exception e){
	        	  System.out.println(e);
	          }    
	}

}
