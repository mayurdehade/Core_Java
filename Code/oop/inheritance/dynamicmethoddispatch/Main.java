//Demo of dynamic method dispatch
//Dynamic method dispatch is the mechanism by which a call to an overridden 
//method is resolved at run time, rather than compile time.
package core.oop.inheritance.dynamicmethoddispatch;

public class Main {

	//main method
	public static void main(String[] args) {
		//creating object (instance) of B with reference of A class
		//this object is refer to parent (base) class
		A a = new B();
		
		//calling variables 
		//this will call the variables of the parent class
		System.out.println(a.a);
		System.out.println(a.b);
		
		//calling methods
		//m1 method is of class A
		a.m1(); //this is calling to method of A class
		
		//Method m2 is in A class and overridden to B class. 
		//Variables (data members) cannot be overridden therefore object refers the parent class variables.)
		//Here overridden concept is applied (Run time polymorphism)
		a.m2(); //this is calling to method of B class (overridden method)
		
		
	}

}
