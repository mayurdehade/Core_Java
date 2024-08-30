//Bounded Generic Types:
//If we want to use generics for some specific types

package core.generics;

//Bounded Generics Class
//only support children of Number class
class GenericClass<T extends Number> {

	public void display() {
		System.out.println("This is a bounded type generics class");
	}
}

public class BoundedGenerics {

	public static void main(String[] args) {

		// Gives error: Bounded Mismatch
//		GenericClass<String> gc = new GenericClass<>();

		GenericClass<Integer> gc2 = new GenericClass<>();

		GenericClass<Float> gc3 = new GenericClass<>();

		GenericClass<Double> gc4 = new GenericClass<>();
	}

}
