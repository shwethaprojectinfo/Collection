package conversion;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	 
	// class for writing logic of the problem
	public static class ArrayToCollection {
		/**
		 * 
		 * @param args
		 */
	   public static  void main(String[] args) {
		
	        String students[] = { "Kamlesh", "Abhay",
	                              "Abhishek", "Shivansh" };
	 
	        System.out.println("Array input: "
	                           + Arrays.toString(students));
	 
	        
	        List<String> studentList = Arrays.asList(students);
            System.out.println("Converted elements: "
	                           + studentList);
	    }
	}

}
