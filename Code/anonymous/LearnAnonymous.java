package core.anonymous;

public class LearnAnonymous {
	
	public void welcome() {
		System.out.println("Welcome method in class");
	}

    // Creating an anonymous class using a superclass
    // Anonymous class extending SuperClass
    SuperClass obj1 = new SuperClass() {
        @Override
        void hello() {
        	this.info();
            // Overriding the hello() method of SuperClass
            System.out.println("Hello from the anonymous class");
        }

        // You can define additional methods in the anonymous class
        public void info() {
            System.out.println("Additional method in the anonymous class");
        }
    };

    // Creating an anonymous class using an interface
    // Anonymous class implementing SuperInterface
    SuperInterface obj2 = new SuperInterface() {

        @Override
        public void sayHello() {
            // Implementing the sayHello() method from the SuperInterface
            System.out.println("Hello from the anonymous class implementing SuperInterface");
        }
    };

    public static void main(String[] args) {
        LearnAnonymous demo = new LearnAnonymous();

        // Calling the overridden hello() method from the anonymous class
        demo.obj1.hello(); // Output: Hello from the anonymous class

        // Calling the implemented sayHello() method from the anonymous class
        demo.obj2.sayHello(); // Output: Hello from the anonymous class implementing SuperInterface
        
        //An anonymous object in Java is an object that is created without explicitly assigning it a reference variable
        //this is anonymous object which we use directly without storing it.
        new LearnAnonymous().welcome();
    
    }

}

class SuperClass {
    void hello() {
        System.out.println("Hello from the superclass...");
    }

}

interface SuperInterface {
    void sayHello();
}
