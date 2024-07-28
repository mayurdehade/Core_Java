//Super Keyword
//The super keyword in java is a reference variable which is used to refer immediate parent class object.

//1. super can be used to refer immediate parent class instance variable.
//2. super can be used to invoke immediate parent class method.
//3. super() can be used to invoke immediate parent class constructor.
package core.oop.superkeyword;

//parent class
class Animal {
	//constructor
	Animal() {
		System.out.println("Animal constructor is called");
	}
	
	//method
	void display() {
		System.out.println("Animal is not bird");
	}
}

//child class
class Horse extends Animal {
	//constructor
	Horse() {
		//parent class constructor is called
		//if super is not there java compiler adds the super
		//keyword automatically for calling parent class constructor
		
		super(); //this call parent class constructor
		super.display(); //this call parent class display method
		System.out.println("Horse constructor is called");
	}
}

public class SuperKeywordDemo {

	public static void main(String[] args) {
		Horse h = new Horse();
	}

}

//output
//Animal constructor is called
//Animal is not bird
//Horse constructor is called

