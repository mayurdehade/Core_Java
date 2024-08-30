/*
 * Wrapper Class: A wrapper class in java is a class whose object wraps or contains primitive data types.
 * ex. char -> Character, int -> Integer, long -> Long etc.
 */

package core.wrapperclasses;

public class WrapperClassDemo {

	public static void main(String[] args) {
		
		//Wrapper class
		//Creating object of Integer class
		Integer num1 = new Integer(12);
		
		//value of used for creating object of wrapper classes and use any type of value 
		//it convert it into reference type
		Integer num2 = Integer.valueOf(12);
		//convert string to integer type
		Integer num3 = Integer.valueOf("112");
		
		//simple converting int to Integer
		//primitive to non primitive (wrapper)
		Integer num4 = 12;
		
		//Autoboxing: Automatic conversion of primitive types to the obj of their corresponding wrapper classes
		Integer num5 = 29;
		
		//Unboxing: Reverse process of autoboxing 
		//conversion of an obj of a wrapper class to its corresponding primitive types
		int num6 = num5;
		
		
	}

}
