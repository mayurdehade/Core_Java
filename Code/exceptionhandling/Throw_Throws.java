/*
 * The java throws keyword is used to declare an exception.
 * It gives an information to the programmer that there might
 * be an exception so, it better to be prepared with a try catch block!
 */
package core.exceptionhandling;

public class Throw_Throws {

	// throws keyword
	// In this function may exception is occur for that used throws keyword to throw the exception
	// the programmer how use this function is required to handle the exception
	// using try catch
	static int divide(int a, int b) throws ArithmeticException {
		int c = a / b;
		return c;
	}

	public static void main(String[] args) {
		try {
			divide(2, 0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
