//Single Level Inheritance Demo
//When a class inherits another class, it is known as a single inheritance.
//Here Student is inherits from Citizen class, so there is the single inheritance.

package core.oop.inheritance.singlelevelinheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		//creating object of derived class
		Student s = new Student();
		
		//by child class object we can access 
		//child as well as parent class data members and methods.
		
		//Methods of Base (Parent) class
		s.setName("Mayur");
		s.setAddarno(12345678);
		s.setAddress("Nashik");
		
		//Methods of Derived (Child) class
		s.setRoll(14);
		s.setStd('A');
		
		//this will calling method of student class
		System.out.println(s.toString());
	}

}
