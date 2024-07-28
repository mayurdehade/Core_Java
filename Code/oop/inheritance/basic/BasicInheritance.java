//Basic of Inheritance 
//When one class acquires all the properties and behaviors of a
//parent class, it is known as inheritance.

/*
 * Important:
 * 1. We cannot extend final class
 * 2. One class can extend single class
 * 
 * Why do we need java inheritance?
 * 1. Code Reusability
 * 2. Method overriding
 * 3. Abstraction
 * 4. To increase features of class.
 */

package core.oop.inheritance.basic;

public class BasicInheritance {

	public static void main(String[] args) {
		//creating object of derived class
		Fish f = new Fish();
		
		//calling methods of base class
		f.breath();
		
		//calling methods of derived class
		f.swim();
		
		
	}

}

//Parent or Base class
class Animal {
	String color;
	
	void eat() {
		System.out.println("Eats");
	}
	
	void breath() {
		System.out.println("Breath");
	}
}

//Child or Derived class
class Fish extends Animal {
	int fins;
	
	void swim() {
		System.out.println("Fish can swim");
	}
}
