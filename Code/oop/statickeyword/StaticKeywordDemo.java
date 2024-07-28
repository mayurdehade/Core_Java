//Static Keyword 
//The static keyword in java in mainly used for memory management.
//The static keyword used to share the same variable or method of given class.
//Static keyword apply on -> Blocks, Variables, Methods, Classes

//Static methods and variables cannot access non-static members of a class,
//Static methods can be overloaded but not override
package core.oop.statickeyword;

public class StaticKeywordDemo {
	// static variable
	static int a = 10;

	// static block -> static block is executed first
	static {
		System.out.println("Static Block Initialized.");
		System.out.println("Static member a in static block " + a);
	}

	// static method
	static int m1() {
		System.out.println("From m1");
		return 20;
	}

	// static class
	// A class can be made static only if it is a nested class.
	// Nested static class doesn't need a reference of outer class.
	static class MyNestedClass {
		public void disp() {
			// non static method
			System.out.println("Not static method in static class" + a);
		}

		// static method in static class
		public static void show() {
			System.out.println("Static method in static class");
		}
	}

	public static void main(String[] args) {
		// first static block is executed

		// Accessing static data member directly without object
		System.out.println(StaticKeywordDemo.a);

		StaticKeywordDemo.m1(); // static method

		MyNestedClass m = new MyNestedClass();
		m.disp(); // calling static class method directly without reference of main class

		MyNestedClass.show(); // static method in static class

	}

}

//output
//Static Block Initialized.
//Static member a in static block 10
//10
//From m1
//Not static method in static class10
//Static method in static class
