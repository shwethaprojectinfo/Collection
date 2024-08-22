package properties;

import java.util.*;
import java.io.*;

public class TestClass {
	public static void main(String[] args) throws IOException {
		FileReader reader=new FileReader("src/properties/Dataofuser.properties");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("username"));  
	    System.out.println(p.getProperty("password"));
	    System.out.println("hlo");
	}
//		 Properties p = new Properties();
//		  
//	        // add properties to it
//	        p.setProperty("name", "kruthika");
//	        p.setProperty("email",
//	                      "kruthika@gmail.com");
//	  
//	        // store the properties to a file
//	        p.store(new FileWriter("Dataofuser.properties"),
//	                "properties");
//	        System.out.println(p.getProperty("name"));
//	        System.out.println(p.getProperty("email"));;
//	        
//	    }
}



//public class TestClass {  
//public static void main(String[] args)throws Exception{  
//  
//Properties p=System.getProperties();  
//Set set=p.entrySet();  
//  
//Iterator itr=set.iterator();  
//while(itr.hasNext()){  
//Map.Entry entry=(Map.Entry)itr.next();  
//System.out.println(entry.getKey()+" = "+entry.getValue());  
//}  
//  
//}  
//}  