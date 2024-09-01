package core.inputoutput;

import java.io.FileOutputStream; // Import FileOutputStream to write bytes to a file.
import java.io.IOException;       // Import IOException to handle input-output exceptions.
import java.io.Console;           // Import Console to interact with the console (standard input).

public class FileWriterAndConsoleExamples {

    // Main method, the entry point of the program
    public static void main(String[] args) {
//        fileOutputStreamExample(); // Calls the method to demonstrate writing data to a file using FileOutputStream.
        consoleExample();          // Calls the method to demonstrate reading user input from the console using Console.
    }

    // Example 7: Using FileOutputStream to write a string to a file
    public static void fileOutputStreamExample() {
        String path = "H:/JavaFullStack/Core_Java/core_java/src/core/inputoutput/xyz.txt"; // Path of the file to write to.
        String content = "Hello Mayur, You are learning java...."; // Content to be written to the file.
        
        // Use try-with-resources to automatically close the FileOutputStream after the operation is completed
        try (FileOutputStream fos = new FileOutputStream(path)) {
            byte[] bytes = content.getBytes(); // Convert the string content to a byte array.
            fos.write(bytes); // Write the byte array to the file.
            System.out.println("Successfully written to the file!"); // Print a success message to the console.
        } catch (IOException e) {
            e.printStackTrace(); // Handle any IOExceptions that might occur during the file write operation.
        }
    }

    // Example 8: Using Console to read input from the user
    public static void consoleExample() {
        Console console = System.console(); // Obtain a reference to the system console.
        
        // Check if the console is available (e.g., might not be available in some IDEs)
        if (console != null) {
            System.out.print("Enter the Name: "); // Prompt the user to enter their name.
            String name = console.readLine();     // Read the user's input from the console.
            System.out.println("Hello " + name);  // Print a greeting message with the user's name.
        } else {
            System.out.println("No console available"); // Print a message if the console is not available.
        }
    }
}
