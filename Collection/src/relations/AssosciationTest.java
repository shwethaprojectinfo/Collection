package relations;

class Course {
	String name;
	
	Course(String name) {
		this.name = name;
	}
}

class Student {
    String name;
    Course course;
    
    Student(String name, Course course) {
    	this.name = name;
    	this.course = course;
    }
    
    String getName() {
    	return this.name;
    }
    
    String getCourse() {
    	return this.course.name;
    }
}

public class AssosciationTest {
	public static void main(String[] args) {
		Course Course = new Course("Science");  
		Student student = new Student("Shwetha",Course);
		
		System.out.println(student.getName()+ " is enrolled in " +student.getCourse());
	}
}