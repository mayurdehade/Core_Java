package core.generics;

public class GenericMethods {
	
	//generic method 1
	static <E> void printData(E data) {
		System.out.println(data);
	}
	
	//generic method 2
	<B> void printData2(B data) {
		System.out.println(data);
	}
	

	public static void main(String[] args) {
		printData(12345);
		printData("Hello Mayur");
		
		
		//creating obj of class for accessing non static method
		GenericMethods gm = new GenericMethods();
		//directly called generic method
		gm.printData2("hello java");
		
		//this is also working
		gm.<Integer>printData2(02145);
		
		gm.printData2(true);
		
		
	}

}
