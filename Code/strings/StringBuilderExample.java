//Mutable: Like StringBuffer, StringBuilder is mutable, allowing modifications to the object's content.

//Not Thread-Safe: StringBuilder is not synchronized, making it faster than 
//StringBuffer but not thread-safe. It is suitable for use in single-threaded environments.

package core.strings;
public class StringBuilderExample {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        
        // Append operation
        sb.append(" World!");
        
        // No new object is created; sb now contains "Hello World!"
        System.out.println("StringBuilder: " + sb.toString()); // Output: Hello World!
        
        // Insert operation
        sb.insert(5, " Java");
        System.out.println("After Insert: " + sb.toString()); // Output: Hello Java World!
        
        // Replace operation
        sb.replace(6, 10, "C++");
        System.out.println("After Replace: " + sb.toString()); // Output: Hello C++ World!
        
        // Delete operation
        sb.delete(5, 9);
        System.out.println("After Delete: " + sb.toString()); // Output: Hello World!
        
        // Reverse operation
        sb.reverse();
        System.out.println("After Reverse: " + sb.toString()); // Output: !dlroW olleH
    }
}
