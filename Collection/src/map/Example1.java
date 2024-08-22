package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		
		Map op = new HashMap();
		
		op.put(1, "shwetha");
		op.put(2, "kruthi");
//		System.out.println(op);
		System.out.println(op.size());//intial index start from value is 1
//		System.out.println(op.keySet());
//		System.out.println(op.values());
//		System.out.println(op.isEmpty());
//		System.out.println(op.equals(3));
//		System.out.println(op.hashCode());//hashcode of this map
		
//		Map<Object, Object> op1 = new HashMap<>();
//		 op1.put(1, "anu");
//		 op1.put(2, "manju");
		 //System.out.println(op1);
		//Converting to Set so that we can traverse   
//		 Set set=op1.entrySet(); 
//		    Iterator itr=set.iterator();
		    
		    //System.out.println(set);
		 
		 //System.out.println(op1.putAll(op));
		 //System.out.println(op1.putIfAbsent(3, "danvi"));
//		    System.out.println(op1.replace(1, "anu", "anusuya"));
//		    System.out.println(op1);
//		 op1.put(2, "manjunath");
//		 System.out.println(op1);//no duplicate key ,if we store also it replace by updated one 
//	     op1.putAll(op);
//	     System.out.println(op1);
//	     for(Map.Entry m:op1.entrySet()){  
//			   System.out.println(m.getValue()+" "+m.getKey()); 
//	     op1.remove(1);
//	     System.out.println(op1);
	}

	}
