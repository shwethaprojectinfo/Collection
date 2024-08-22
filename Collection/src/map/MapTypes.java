package map;
	import java.util.*;
	  
	// Main class
	public class MapTypes {
	  
	    // Main driver method
	    public static void main(String args[])
	    {
	        // Creating an empty HashMap
	    Map<String, Integer> mp = new HashMap<String,Integer>(); 
	        // Inserting pairs in above Map
	        // using put() method
	        mp.put("a", new Integer(100));
	        mp.put("b", new Integer(200));
	        mp.put("c", new Integer(300));
	        mp.put("d", new Integer(400));
	  
	        // Traversing through Map using for-each loop
	        for (Map.Entry<String, Integer> me :
	             mp.entrySet()) {
	  
	            // Printing keys
	            System.out.print(me.getKey() + ":");
	            System.out.println(me.getValue());
	        }
	    }
	

}
