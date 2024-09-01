package core.inputoutput;

import java.io.BufferedInputStream; // Import BufferedInputStream to read data from a file with buffering.
import java.io.FileInputStream;     // Import FileInputStream to read bytes from a file.
import java.io.IOException;         // Import IOException to handle input-output exceptions.
import java.io.InputStreamReader;   // Import InputStreamReader to convert byte streams to character streams.
import java.io.BufferedReader;      // Import BufferedReader to read text from a character-input stream.
import java.util.Scanner;           // Import Scanner to read user input from various input sources.

public class BufferedIOAndUserInputExamples {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        bufferedInputStreamExample(); // Calls the method to demonstrate reading from a file using BufferedInputStream.
        bufferedReaderExample(); // Calls the method to demonstrate reading from the console using BufferedReader.
        scannerExample(); // Calls the method to demonstrate reading from the console using Scanner.
    }

    // Example 4: Using BufferedInputStream to read data from a file
    public static void bufferedInputStreamExample() {
        // Use try-with-resources to automatically close streams after operations are completed
        try (FileInputStream fin = new FileInputStream("H:/JavaFullStack/Core_Java/core_java/src/core/inputoutput/Finput.txt");
             BufferedInputStream bis = new BufferedInputStream(fin)) {

            int i;  // Variable to hold each byte read from the file

            // Loop to read each byte from the file until end of file is reached
            while ((i = bis.read()) != -1) {
                // Print the byte as a character to the console
                System.out.print((char) i);
            }
            // Print a message indicating that the buffered reading is complete
            System.out.println("\nBuffered read completed!");

        } catch (IOException e) {
            // Handle any IOExceptions that might occur during file operations
            e.printStackTrace();
        }
    }

    // Example 5: Using BufferedReader to read input from the console
    public static void bufferedReaderExample() {
        // Use try-with-resources to automatically close streams after operations are completed
        try (InputStreamReader isr = new InputStreamReader(System.in); // Convert System.in byte stream to character stream
             BufferedReader br = new BufferedReader(isr)) { // Buffer the input for efficient reading

            String name; // Variable to store user input

            // Infinite loop to continually prompt the user for input until a certain condition is met
            while (true) {
                // Prompt the user to enter a website
                System.out.println("Enter Website:");
                // Read the user input from the console
                name = br.readLine();
                // Print the entered input back to the console
                System.out.println("You Entered: " + name);
                // Break the loop if the entered input matches the specific website
                if ("www.google.com".equals(name)) {
                    break; // Exit the loop
                }
            }

        } catch (IOException e) {
            // Handle any IOExceptions that might occur during console input operations
            e.printStackTrace();
        }
    }

    // Example 6: Using Scanner to read input from the console
    public static void scannerExample() {
        // Use try-with-resources to automatically close the scanner after operations are completed
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the first number
            System.out.print("Enter 1st Number: ");
            int a = scanner.nextInt(); // Read the first number from the console

            // Prompt the user to enter the second number
            System.out.print("Enter 2nd Number: ");
            int b = scanner.nextInt(); // Read the second number from the console

            // Calculate and print the sum of the two numbers
            System.out.println("Addition is: " + (a + b));
        }
    }
}
