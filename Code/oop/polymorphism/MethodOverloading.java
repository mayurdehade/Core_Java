//Method Overloading Demo
//Method overloading -> having two or more methods in a class with the same name
//and different number or type of parameters.
package core.oop.polymorphism;

import java.util.Scanner;

class Calculator {
	// creating method of name sum with two argument
	public int sum(int a, int b) {
		return a + b;
	}

	// creating method of name sum with three argument
	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	// creating method of name sum with two float argument
	public float sum(float a, float b) {
		return a + b;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		// creating object of class
		Calculator c = new Calculator();

		System.out.println("Sum is " + c.sum(20, 30)); //50

		System.out.println("Sum is " + c.sum(12, 33, 32)); //77

		System.out.println("Sum is " + c.sum(15.45f, 12.5f)); //27.95
	}

}
