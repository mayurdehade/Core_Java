//Child class
package core.oop.inheritance.dynamicmethoddispatch;

public class B extends A{
	//variables
	int b = 100;
	int c = 200;

	//constructor
	public B() {
		super();
		System.out.println("Constructor of B");
	}
	
	//methods
	//this is overridden method
	public void m2() {
		System.out.println("M2 of B");
	}
	
	public void m3() {
		System.out.println("M3 of B");
	}
}
