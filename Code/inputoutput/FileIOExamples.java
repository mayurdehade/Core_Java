package core.inputoutput;

import java.io.FileReader;          // Importing FileReader for reading characters from a file.
import java.io.FileWriter;          // Importing FileWriter for writing characters to a file.
import java.io.FileInputStream;     // Importing FileInputStream for reading bytes from a file.
import java.io.FileOutputStream;    // Importing FileOutputStream for writing bytes to a file.
import java.io.IOException;         // Importing IOException to handle input-output exceptions.
import java.io.SequenceInputStream; // Importing SequenceInputStream to combine multiple input streams.

public class FileIOExamples {

    // Main method that serves as the entry point of the program
    public static void main(String[] args) throws Exception {
        // Calls the method to copy characters from one file to another
        copyCharacters();
        
        // Calls the method to demonstrate file input and output stream operations
        fileInputOutputStream();
        
        // Calls the method to demonstrate SequenceInputStream which reads from two files sequentially
        sequenceInputStreamExample();
    }

    // Example 1: Copy Characters from one file to another
    public static void copyCharacters() {
        FileReader reader = null;  // Initialize a FileReader object to read characters from a file
        FileWriter writer = null;  // Initialize a FileWriter object to write characters to a file
        try {
            // Create a FileReader object to read from "FileReader.txt"
            reader = new FileReader("H:/JavaFullStack/Core_Java/core_java/src/core/inputoutput/FileReader.txt");
            
            // Create a FileWriter object to write to "FileWriter.txt"
            //if we only give the name of file then file is generated into project folder outside of src
            writer = new FileWriter("H:/JavaFullStack/Core_Java/core_java/src/core/inputoutput/FileWriter.txt");
            
            int c;  // Variable to hold each character read from the file
            
            // Loop to read each character from the file until end of file is reached
            while ((c = reader.read()) != -1) {
                // Write the character to the output file
                writer.write(c);
            }
            
            // Print confirmation message to the console
            System.out.println("Characters copied successfully!");
        } catch (IOException e) {
            // Handle any IOExceptions that might occur during file operations
            e.printStackTrace();
        } finally {
            // Close the FileReader and FileWriter in the finally block to ensure they are closed even if an exception occurs
            try {
                if (reader != null) {
                    reader.close(); // Close the FileReader
                }
                if (writer != null) {
                    writer.close(); // Close the FileWriter
                }
            } catch (IOException e) {
                // Handle any IOExceptions that might occur while closing the files
                e.printStackTrace();
            }
        }
    }

    // Example 2: FileInputStream and FileOutputStream to read and write bytes
    public static void fileInputOutputStream() {
        // Define the path of the input file
        String inputPath = "H:/JavaFullStack/Core_Java/core_java/src/core/inputoutput/Input.txt";
        
        // Define the path of the output file
        String outputPath = "H:/JavaFullStack/Core_Java/core_java/src/core/inputoutput/Output.txt";
        
        // Use try-with-resources to automatically close the streams after the operations
        try (FileInputStream fis = new FileInputStream(inputPath);   // Initialize FileInputStream to read from input file
             FileOutputStream fos = new FileOutputStream(outputPath)) { // Initialize FileOutputStream to write to output file

            int i;  // Variable to hold each byte read from the file
            
            // Loop to read each byte from the input file until end of file is reached
            while ((i = fis.read()) != -1) {
                // Write the byte to the output file
                fos.write(i);
            }
            
            // Print confirmation message to the console
            System.out.println("File read and written successfully!");

        } catch (IOException e) {
            // Handle any IOExceptions that might occur during file operations
            e.printStackTrace();
        }
    }

    // Example 3: SequenceInputStream to read from two files sequentially
    public static void sequenceInputStreamExample() {
        // Define the path of the first input file
        String path1 = "H:/JavaFullStack/Core_Java/core_java/src/core/inputoutput/example.txt";
        
        // Define the path of the second input file
        String path2 = "H:/JavaFullStack/Core_Java/core_java/src/core/inputoutput/example2.txt";
        
        // Use try-with-resources to automatically close the streams after the operations
        try (FileInputStream fin1 = new FileInputStream(path1);   // Initialize FileInputStream for the first file
             FileInputStream fin2 = new FileInputStream(path2);   // Initialize FileInputStream for the second file
             SequenceInputStream sis = new SequenceInputStream(fin1, fin2)) { // Combine both input streams into one SequenceInputStream

            int i;  // Variable to hold each byte read from the combined streams
            
            // Loop to read from the combined streams until the end of both streams is reached
            while ((i = sis.read()) != -1) {
                // Print the byte as a character to the console
                System.out.print((char) i);
            }

        } catch (IOException e) {
            // Handle any IOExceptions that might occur during file operations
            e.printStackTrace();
        }
    }
}
