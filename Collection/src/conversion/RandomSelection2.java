package conversion;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.concurrent.ThreadLocalRandom;
	 
	public class RandomSelection2 {
	 
	    // Drive Function
	    public static void main(String[] args)
	    {
	 
	        // create a list of Integer type
	        List<Integer> list = new ArrayList<>();
	 
	        // add 5 element in ArrayList
	        list.add(10);
	        list.add(20);
	        list.add(30);
	        list.add(40);
	        list.add(50);
	 
	        RandomSelection2 obj = new RandomSelection2();
	 
	        // boundIndex to select in sub list
	        int boundIndex = 3;
	 
	        // take a random element from list and print it
	        System.out.println(
	            obj.getRandomElement(list, boundIndex));
	    }
	 
	    // Function to select an element based on index and
	    // return an element
	    public int getRandomElement(List<Integer> list,
	                                int bound)
	    {
	        // ThreadLocalRandom generates an int type number
	        return list.get(
	            ThreadLocalRandom.current().nextInt(list.size())
	            % bound);
	    }
	}


