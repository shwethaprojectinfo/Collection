package comparableandcomparator;
	import java.util.*;  

public class DriverNameComparator implements Comparator<Object>{  
	public int compare(Object o1,Object o2){  
	Student1 s1=(Student1)o1;  
	Student1 s2=(Student1)o2;  
	  
	return s1.name.compareTo(s2.name);  
	}  
	}  


