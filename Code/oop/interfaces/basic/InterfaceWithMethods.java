package core.oop.interfaces.basic;

public interface InterfaceWithMethods {

    // Interface can have static and default methods
    // JDK 8 introduced the ability for interfaces to have static and default methods

    // Abstract method that must be implemented by the implementing class
    void sayHello();

    // Static method in an interface
    // It is accessible using the interface name, not through an instance of the implementing class
    // Static methods in interfaces are implicitly public, so no need to specify it
    static void info() {
        System.out.println("Interfaces can have static methods with implementation...");
        System.out.println("It is accessible using the interface only...");
    }

    // Default method in an interface
    // This method can be overridden by the implementing class, but it is not mandatory
    // It provides a default implementation that can be used as is
    default void information() {
    	//In this we can also call the interface methods
    	this.sayHello();
        System.out.println("Default method in interface with implementation...");
        System.out.println("It is accessible using the implementation class instance...");
    }
}
