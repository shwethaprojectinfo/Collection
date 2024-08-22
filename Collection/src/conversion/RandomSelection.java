package conversion;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Random;
	 
	public class RandomSelection {
	 
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
	 
	        RandomSelection obj = new RandomSelection();
	 
	        // take a random element from list and print them
	        System.out.println(obj.getRandomElement(list));
	    }
	 
	    // Function select an element base on index
	    // and return an element
	    public int getRandomElement(List<Integer> list)
	    {
	        Random rand = new Random();
	        return list.get(rand.nextInt(list.size()));
	    }
	}


