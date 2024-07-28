//Multiple Inheritance
package core.oop.interfaces.multipleinheritance;
/*
 * Here the code is for multiple inheritance
 * Here two interfaces are created one is Herbivore and second is Carnivore
 * and it consist one method similar is both of interfaces then we implements this
 * method to child class and child class override the abstract method
 * and there is no ambiguity
 */

//Interface 1 
interface Herbivore {
	void eat();
}

//Interface 2
interface Carnivore {
	void eat();
}

//child class
class Bear implements Herbivore, Carnivore {

	@Override
	public void eat() {
		System.out.println("Bear eats grass and meat");
	}

}

public class MultipleInheritance {
	public static void main(String[] args) {
		//constructor
		Bear b = new Bear();
		
		//called child class method
		b.eat();
	}
}

//output:
//Bear eats grass and meat
