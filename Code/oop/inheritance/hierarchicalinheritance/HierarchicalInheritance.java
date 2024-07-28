//Hierarchical Inheritance Demo
//When two or more classes inherits a single class, it is known as hierarchical inheritance.
//In this example we are Child1 and Child2 classes inherits the Father class
package core.oop.inheritance.hierarchicalinheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		//Here we are extending two classes from one parent class
		
		//creating instance of child class
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		
		c1.setC1Name("Kaliya"); //setting first child name
		c2.setC2Name("Gabbar"); //setting second child name
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
