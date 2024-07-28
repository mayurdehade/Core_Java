//instanceof operator -> Conditional Operator
package core.oop.instanceofdemo;

public class Dog extends Animal {

	public static void main(String[] args) {
		// instanceof operator use to test whether the object is instance of
		// specified type. It return true or false.
		// If the object is belongs to specified class then it return true otherwise it
		// return false.
		// It we apply instanceof operator with a variable that have null value, it
		// returns false.

		// create object of dog class
		Dog d = new Dog();

		System.out.println(d instanceof Animal); // true -> Dog is inherited from Animal

		Dog a = null;
		int b = 22;

		System.out.println(a instanceof Dog);// return false
		System.out.println(a instanceof Animal); // return false (because of null)
	}
}
