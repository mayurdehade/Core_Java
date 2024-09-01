package core.inputoutput;

import java.io.File;
import java.util.Date;

public class FileInfoExample {

    public static void main(String[] args) {
        // Define the file path
        File path = new File("H:/JavaFullStack/Core_Java/core_java/src/core/inputoutput/abc.txt");
        
        // Check if the path exists
        if (path.exists()) {
            System.out.println("Path exists: " + path.exists());
            
            // Check if the path is a directory
            System.out.println("Is it a directory? " + path.isDirectory());
            
            // Check if the path is hidden
            System.out.println("Is it hidden? " + path.isHidden());
            
            // Get and print the simple name (file or directory name)
            System.out.println("File/Directory Name: " + path.getName());
            
            // Get and print the absolute path
            System.out.println("Absolute Path: " + path.getAbsolutePath());
            
            // Get and print the file size in bytes
            System.out.println("File Size (bytes): " + path.length());
            
            // Get and print the last modified date of the file
            long lastModifyInMillis = path.lastModified();
            Date lastModifyDate = new Date(lastModifyInMillis);
            System.out.println("Last Modified Date: " + lastModifyDate);
        } else {
            // If the path does not exist, inform the user
            System.out.println("The specified path does not exist.");
        }
    }
}
