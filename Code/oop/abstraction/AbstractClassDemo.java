//Abstract class Demo
/* 
 * It basically deals with hiding the internal details and showing the
 * essential things to the user.
 * 
 * 1. An abstract method is a method that is declared without implementation.
 * 2. A abstract class may or may not have all abstract methods.
 * 	  Some of them can be concrete methods but at least one abstraction method is necessary.
 * 3. There can be no object of an abstract class. That is, an abstract class
 *    can not be directly instantiated with the new operator.
 */
package core.oop.abstraction;

//abstract class
abstract class Animal {
	String color;

	// constructor of abstract class
	Animal() {
		color = "brown";
	}

	void eat() {
		System.out.println("Animal eats");
	}

	// abstract method (method without body)
	abstract void walk();
}

//child class
class Horse extends Animal {

	// Constructor
	Horse() {
		System.out.println("Horse constructor called...");
	}

	@Override
	void walk() {
		System.out.println("Walks on 4 legs");
	}

	void changeColor() {
		color = "Black";
	}
}

class Chicken extends Animal {

	@Override
	void walk() {
		System.out.println("Walks on 2 legs");
	}

	void changeColor() {
		color = "White";
	}

}

class Mustang extends Horse {
	Mustang() {
		System.out.println("Mustang Constructor called...");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		Horse h = new Horse();
		h.eat();
		h.walk();

		System.out.println(h.color);

		Chicken c = new Chicken();
		c.eat();
		c.walk();
		System.out.println(c.color);

		System.out.println("-------------------------");

		// creating the object of the mustang class
		Mustang m = new Mustang();
		// Horse (parent class) constructor called first
		// then child class constructor (mustang)
	}

}

//Output: 
//Horse constructor called...
//Animal eats
//Walks on 4 legs
//brown
//Animal eats
//Walks on 2 legs
//brown
//-------------------------
//Horse constructor called...
//Mustang Constructor called...
