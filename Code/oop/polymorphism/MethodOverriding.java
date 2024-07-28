//Method overriding demo
//After a method is inherited it is possible to change the implementation of the method in the child class.
//If subclass has the same method as declared in the parent class, it is known as method overriding in java.

//Parameters MUST be different, Method name MUST be same, any method can be overloaded
package core.oop.polymorphism;

//Base class
class Vehical {
	void run() {
		System.out.println("Vehical is running....");
	}
}

//Derived class 
class Bike extends Vehical {
	// Override method
	void run() {
		System.out.println("Bike is running....");
		// calling the base class run
		super.run();
	}

}

public class MethodOverriding {

	public static void main(String[] args) {
		Bike b = new Bike();

		Vehical v = new Vehical();

		// calling the Bike class method
		b.run();
		// Bike is running....
		// Vehical is running....

		// calling the Vehical class method
		v.run();
		// Vehical is running....

	}

}
