package core.collections.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

// Creating a custom class named Student
class Student {
    // Instance variables rollNo and name for each student object
    int rollNo;
    String name;

    // Constructor to initialize the Student object with rollNo and name
    public Student(int rollNo, String name) {
        super();
        this.rollNo = rollNo;
        this.name = name;
    }

    // Override the hashCode method to generate a hash code based on rollNo
    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }

    // Override the equals method to compare Student objects based on rollNo
    @Override
    public boolean equals(Object obj) {
        if (this == obj) // Check if both references are pointing to the same object
            return true;
        if (obj == null) // Check if the passed object is null
            return false;
        if (getClass() != obj.getClass()) // Check if the classes of both objects are the same
            return false;
        Student other = (Student) obj; // Typecast the passed object to Student
        return rollNo == other.rollNo; // Compare the rollNo of both Student objects
    }

    // Override the toString method to return a string representation of the Student object
    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + "]";
    }

}

public class HashSetOfCustomObject {

    public static void main(String[] args) {

        // Creating a HashSet to store Student objects
        Set<Student> st = new HashSet<>();
        
        // Adding Student objects to the HashSet
        st.add(new Student(1, "Mayur"));
        st.add(new Student(2, "Raju"));
        st.add(new Student(1, "Mayur")); // This object will not be added because a Student with rollNo 1 already exists
        
        // Printing the HashSet, which will use the overridden toString method of Student
        System.out.println(st);
        
    }

}
