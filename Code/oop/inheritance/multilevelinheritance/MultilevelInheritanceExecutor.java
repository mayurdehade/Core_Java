//Multilevel Inheritance Demo
//When there is a chain of inheritance, it is known as multilevel inheritance.
//Here Son is extended from Father and
//Father is extended from GrandFather
package core.oop.inheritance.multilevelinheritance;

public class MultilevelInheritanceExecutor {

	public static void main(String[] args) {
		// Creating object of Son class
		Son s = new Son();

		// by using Son class object we can access all parent class methods

		s.setName("Grand Father Shantaram"); // set grand father name
		s.setFname("Father Tukaram"); // set father name
		s.setSname("Son Dagadu"); // set son name

		s.setProperty(1000);
		s.setfProperty(2000);
		s.setTotalProperty(s.getProperty() + s.getfProperty());

		// calling to string method
		System.out.println(s.toString());
	}

}
