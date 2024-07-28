package core.oop.basicoop;

//new class
class Student {
	// data members (Properties)
	String name;
	int rollNo;
	int age;

	// Methods (Behaviors)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Basic {

	public static void main(String[] args) {
		//creating the object of student class
		//object is a real world entity 
		//-> for accessing the class element we have to create object
		
		Student s = new Student();
		
		s.setName("Mayur");
		s.setRollNo(7);
		s.setAge(21);
		
		//Printing the values
		System.out.println("Name: "+s.name);
		System.out.println("Roll No: "+s.getRollNo());
		System.out.println("Age: "+s.getAge());
		
	}

}
