//Mutable: StringBuffer is mutable, meaning the content of the object can be 
//modified without creating a new object.

//Thread-Safe: StringBuffer is synchronized, making 
//it thread-safe (suitable for use in multi-threaded environments).

package core.strings;
public class StringBufferExample {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        
        // Append operation
        sb.append(" World!");
        
        // No new object is created; sb now contains "Hello World!"
        System.out.println("StringBuffer: " + sb.toString()); // Output: Hello World!
        
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
