package comparableandcomparator;
	import java.util.*;   
	  
	public class Student1Sample { 
	public static void main(String args[]){  
	  
	ArrayList<Student1> al=new ArrayList<Student1>();  
	al.add(new Student1(101,"Vijay",23));  
	al.add(new Student1(106,"Ajay",27));  
	al.add(new Student1(105,"Jai",21));  
	  
	System.out.println("Sorting by Name");  
	  
	Collections.sort(al,new DriverNameComparator());  
	Iterator<Student1> itr=al.iterator();  
	while(itr.hasNext()){  
	Student1 st=(Student1)itr.next();  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	  
	System.out.println("Sorting by age");  
	  
	Collections.sort(al,new StudentAgeComparator());  
	Iterator<Student1> itr2=al.iterator();  
	while(itr2.hasNext()){  
	Student1 st=(Student1)itr2.next();  
	System.out.println(st.rollno+" "+st.name+" "+st.age);  
	}  
	  
	  
	}  
	}  


