package core.objectclass;

import java.util.Objects;

class Car implements Cloneable { // Implementing Cloneable to allow object cloning
    String model;
    int year;

    public Car(String model, int year) {
        super();
        this.model = model;
        this.year = year;
    }

    // toString method is overridden from Object class to provide a custom string representation
    @Override
    public String toString() {
        return "Car [model=" + model + ", year=" + year + "]";
    }

//	@Override
//	public int hashCode() {
//		return Objects.hash(model, year);
//	}
    
    // Custom hashCode method to generate a unique hash code for the object
    @Override
    public int hashCode() {
        int initialNumber = 29; // A starting prime number
        initialNumber += year; // Adding the year to the hash code
        initialNumber += model.hashCode(); // Adding the model's hash code
        return initialNumber;
    }

    // equals method is overridden to compare two Car objects based on model and year
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // If both references point to the same object
            return true;
        if (obj == null) // If the object being compared is null
            return false;
        if (getClass() != obj.getClass()) // If the objects are of different classes
            return false;
        Car other = (Car) obj; // Casting to the Car class
        return Objects.equals(model, other.model) && year == other.year; // Comparing model and year
    }

    // clone method is overridden to create a copy of the Car object
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calling the clone method from the Object class
    }

    // finalize method is overridden to perform cleanup actions before the object is garbage collected
    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Car object with model: " + model + " is being finalized.");
            // Perform any cleanup actions here, if necessary
        } finally {
            super.finalize(); // Calling finalize from the Object class
        }
    }
}

public class LearnObjectClass {

    public static void main(String[] args) {
        Car car = new Car("Honda", 2024);
        Car car2 = new Car("Honda", 2024);
        Car car3 = new Car("Suzuki", 2020);

        // Demonstrating toString method
        System.out.println(car.toString());
        System.out.println(car); // Automatically calls toString method

        // Demonstrating getClass method
        System.out.println(car.getClass()); // Outputs the class of the object

        // Demonstrating getSuperclass method
        System.out.println(car.getClass().getSuperclass()); // Outputs the superclass, which is Object

        // Demonstrating equals method
        System.out.println(car.equals(car2)); // true because model and year are the same

        // Demonstrating hashCode method
        System.out.println(car.hashCode());
        System.out.println(car3.hashCode());

        // Demonstrating clone method
        try {
            Car carClone = (Car) car.clone(); // Cloning the car object
            System.out.println("Cloned Car: " + carClone);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Demonstrating finalize method (Note: finalize is called by the garbage collector, not manually)
        car = null;
        car2 = null;
        car3 = null;

        // Suggesting the JVM to run garbage collection
        System.gc(); // Requests garbage collection (finalize will be called if objects are collected)
    }
}
