package list;

import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListMethods {
	
	/**
	 * 
	 * @param <T>
	 * @param par
	 */
	static public<T> void meth(T par) {
		System.out.println(par);
	}
	
	public static void main(String[] args) {
		
	          LinkedList<Object> l1 = new LinkedList<>();  
	          
	          l1.add("java");
	          l1.add( 1);
	          l1.add( 'A');
	          //System.out.println(l1);
	          
	          LinkedList<Object> l2 = new LinkedList<>();
	          l2.add(1);
	          l2.add("shwetha");
	          l2.add('S');
	          l2.add(2, "kruthi");
	          l2.addAll(l1);
	          l2.addAll(2, l2);
	          System.out.println(l2);
	          System.out.println();
	          
	          Iterator<Object> itr = l2.iterator();
	        		  {
	        	  while (itr.hasNext())
	        		  System.out.println(itr.next());
	        		  }
	        		  
//	        		  l1.clear();
//	        		  System.out.println(l1);
	        		  l1.clone();
	        		  System.out.println(l1);
	        		  
	        		  l1.addAll(l2);
	        		  System.out.println(l1);
	        		  l1.addFirst(0);
	        		  l1.addLast(20);
	        		  System.out.println(l1);
	        		  
	        		  l1.descendingIterator();
	        		  System.out.println(l1);
	        		  
	        		  l1.element();
	        		  System.out.println(l1);
	        		  
	        		  System.out.println(l1.indexOf('S'));
	        		  System.out.println(l1.removeFirst());
	        		  //System.out.println(l1.removeFirstOccurrence(l1));
	        		  
	        		  
	        		  
	        		  System.out.println(l1.containsAll(l2));
	        		  System.out.println(l2.contains(l1));
	        		 //System.out.println( l1.removeFirst());
	        		  
	        		  
	          
	          meth("Shwetha");
	          meth(1);
	           
	}

}
