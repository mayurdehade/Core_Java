//Immutable: Strings are immutable, meaning once a String object is created, it cannot be modified. 
//Any modification results in the creation of a new String object.

package core.strings;
public class StringExample {

    public static void main(String[] args) {
        String str = "Hello";
        
        // Concatenation
        str = str + " World!";
        
        // str is now a new String object with "Hello World!"
        System.out.println("String: " + str); // Output: Hello World!
        
        // String methods
        System.out.println("Length: " + str.length()); // Output: 12
        System.out.println("Char at index 1: " + str.charAt(1)); // Output: e
        System.out.println("Substring: " + str.substring(6)); // Output: World!
    }
}
