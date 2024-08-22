package conversion;
	import java.util.*;
	import java.util.stream.*;
	  
	public class HashmapToArraylist2 {
	    public static void main(String[] args)
	    {
	        // Create an empty hash map
	        HashMap<String, Integer> map
	            = new HashMap<>();
	  
	        // Add elements to the map
	        map.put("vishal", 10);
	        map.put("sachin", 30);
	        map.put("vaibhav", 20);
	  
	        // Java 8 code to convert map keys to list
	        // Here, the collect() method collects the
	        // stream of keys in a ArrayList.
	        ArrayList<String> listOfKeys
	            = map.keySet().stream().collect(
	                Collectors.toCollection(ArrayList::new));
	  
	        // Java 8 code to convert map values to list
	        ArrayList<Integer> listOfValues
	            = map.values().stream().collect(
	                Collectors.toCollection(ArrayList::new));
	  
	        System.out.println("The Keys of the Map are "
	                           + listOfKeys);
	  
	        System.out.println("The Values of the Map are "
	                           + listOfValues);
	    }
	}


