package core.oop.interfaces.basic;

public class ImplClass implements InterfaceWithMethods {

    // Implementing the abstract method from InterfaceWithMethods
    @Override
    public void sayHello() {
        System.out.println("Hello there!");
    }

    public static void main(String[] args) {
        
        // Creating an instance of the implementing class
        ImplClass obj1 = new ImplClass();
        
        // Creating an instance using the interface reference
        InterfaceWithMethods obj2 = new ImplClass();
        
        // Calling the static method using the interface name
        InterfaceWithMethods.info();
        
        // Calling the default method using the implementing class instance
        obj1.information();
        
        // Calling the default method using the interface reference
        obj2.information();
        
        // Calling the abstract method implemented by the class
        obj1.sayHello();
    }
}
/*
Output:
Interfaces can have static methods with implementation...
It is accessible using the interface only...
Hello there!
Default method in interface with implementation...
It is accessible using the implementation class instance...
Hello there!
Default method in interface with implementation...
It is accessible using the implementation class instance...
Hello there!

*/