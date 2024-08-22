package conversion;

	import java.util.*;
	import java.util.Map.*;
	  
	public class HashmapToArraylist3 {
	    public static void main(String[] args)
	    {
	        HashMap<String, Integer> map
	            = new HashMap<>();
	 
	        map.put("vishal", 10);
	        map.put("sachin", 30);
	        map.put("vaibhava", 20);
	        map.put("vishal", 40);
	
	        Set<Map.Entry<String, Integer> > entrySet
	            = map.entrySet();
	 
	        ArrayList<Map.Entry<String, Integer> > listOfEntry
	            = new ArrayList<Entry<String, Integer> >(entrySet);
	  
	        System.out.println(listOfEntry);
	    }
	}


