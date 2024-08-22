   package map;

import java.util.TreeMap;

public class MapExample {    
		 public static void main(String[] args) {    
		       
		    TreeMap<Object, Object> obj = new TreeMap<>();
		    
		    obj.put(1, "kruthi");
		    obj.put(3, "danvi");
		    obj.put(2, "dimpu");
		    
		    System.out.println(obj);
		    
		    System.out.println(obj.tailMap(2));
		    System.out.println(obj.headMap(2));
		    System.out.println(obj.subMap(1, 3));
		    System.out.println(obj.descendingKeySet());
	         
		     
		     
		     
		   

		 }
	 }

