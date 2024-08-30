//Generics:
//Generics means parameterized types  

package core.generics;

//Creating generic class
class Student<E>{
	
	//E is any type passed while creating object
	E id;
	
	public Student(E id) {
		this.id = id;
	}
	
	//return id of type E
	E getId() {
		return id;
	}
	
	//default constructor
	public Student() {
		
	}
}

class Teacher<A, B> {
	A id1;
	B id2;
	
	public Teacher(A id1, B id2) {
		this.id1 = id1;
		this.id2 = id2;
	}
	
	A getId1() {
		return id1;
	}
	
	B getId2() {
		return id2;
	}
}


public class GenericsDemo {

	public static void main(String[] args) {
		//creating student object with different type of id
		
		Student<String> s1 = new Student<>("One");
		System.out.println(s1.id.getClass()); //String
		System.out.println(s1.getId());
		
		Student<Integer> s2 = new Student<>(1);
		System.out.println(s2.id.getClass()); //Integer
		System.out.println(s2.getId());
		
		//we can also write type in constructor (not necessary)
		Student<Integer> s3 = new Student<Integer>(20);
		System.out.println(s3.id.getClass()); //Integer
		System.out.println(s3.getId());
		
		//we can create object without generics also by using default constructor
		Student s4 = new Student();
		System.out.println(s4);
		
		
		//creating object of generic class with two data types
		Teacher<String, Integer> t1 = new Teacher<>("One", 1);
		System.out.println(t1.id1.getClass());
		System.out.println(t1.id2.getClass());
		System.out.println(t1.getId1());
		System.out.println(t1.getId2());
	}

}
