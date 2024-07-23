//Program to understand stack and heap memory in JVM (Java Virtual Machine)
package core.javabasic.stackheapmemory;

class Calculator {
	// instance variables is stored in Heap memory
	// Heap memory create a box which have two section
	// first for instance variables and second partition for methods
	// In Heap memory only method definition is stored
	// Actual method implementation is stored in stack memory
	int num = 5; // instance variable

	// method (for each method separate stack is created)
	int add(int n1, int n2) {
		return n1 + n2;
	}
}

public class MemoryAllocation {

	// main method
	// separate stack memory for each method
	// stack stores the local variable and reference variables (objects)
	public static void main(String[] args) {
		// local variable stored in stack of main method
		int data = 10;

		// creating object
		// stored in stack of main method with reference to heap
		Calculator obj = new Calculator();
		Calculator obj1 = new Calculator();

		// local variable stored in stack of main method
		int r = obj.add(3, 2);
		// value of n1 and n2 is stored in stack memory of add method in stack of main
		// method

		System.out.println(r);

		// instance variable stored in heap memory
		// New objects are always created in heap space, and
		// the references to these objects are stored in stack memory.

		// if we change the instance variable using one object the
		obj.num = 100;
		// then num value changed for that particular (obj) only not for obj1
		System.out.println(obj.num);// 100
		System.out.println(obj1.num);// 5

	}

}

//Difference between Stack and Heap
/*
 * -> Stack memory is used for storing local variables and function calls and
 * has a fix size. It is fast and efficient, but can only be used for storing
 * short-live data.
 * 
 * -> Heap memory is used for storing objects and class instance (instance
 * variables) and it dynamically allocated at runtime. It slower and less
 * efficient but can be used for storing long live data and is shared among all
 * threads in a program.
 */
