//Program to demonstrate the method

/*
 * method is block of code grouped together to perform a certain task.
 * method in java is a collection of instructions that performs a specific task.
 * It provides reusability of code.
 */
package core.javabasic.methods;

public class MethodDemo {

	// public static -> access modifiers
	// custom method
	//Access Specifier: Public, Private, Protected, Default
	//Return Type: Return type is a data type that the method returns.
	//It may have a primitive data type, object, collection, void etc.
	//If method does not return anything, we use void keyword.
	
	//Types of method
	//1. Pre-defined Method
	//2. User-defined Method
	
	//Static method
	// A method that has static keyword is known as static method.
	// Method that belongs to a class rather than an instance of a class is known as a static method.
	// The main advantage of static method is that we can call it without creating an object.
	
// access-specifier return-type method-name() 
//	{
		//method body
//	}
	
	public void printHelloWord() {
		System.out.println("Hello World!!!");
//		return;
	}

	// main method
	// entry point of the code execution
	public static void main(String[] args) {
		MethodDemo mt = new MethodDemo();
		// calling method
		mt.printHelloWord();
	}

}
