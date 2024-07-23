//Program to demonstrate method with parameters
package core.javabasic.methods;

import java.util.Scanner;

public class MethodWithParameters {
	
	//Parameters is a variable used to define a particular value during a function defination.
	//Argument is a value passed to a function when the function is called.
	
	
	//this method require two parameters
	public int calculateSum(int a, int b) { //parameters
		//return int value
		return a+b;
	}
	
	public static void main(String[] args) {
		//creating object
		MethodWithParameters m = new MethodWithParameters();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		//display sum
		System.out.println("Sum: " + m.calculateSum(a, b)); //arguments
	}
	

}
