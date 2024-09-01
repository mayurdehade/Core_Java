package core.printmethods;

public class PrintDemo {
    public static void main(String[] args) {
        
        // Using print - prints text without a newline
        System.out.print("Hello");
        System.out.print(" ");
        System.out.print("World!");
        // Output: Hello World!
        // Both words are printed on the same line without a newline in between.

        System.out.println(); // To move to the next line for clarity in output

        // Using println - prints text with a newline at the end
        System.out.println("Hello");
        System.out.println("World!");
        // Output:
        // Hello
        // World!
        // Each word is printed on a new line because println adds a newline after printing.

        // Using printf - prints formatted text
        int age = 25;
        double salary = 50000.50;
        String name = "John";

        System.out.printf("Name: %s, Age: %d, Salary: %.2f", name, age, salary);
        // Output: Name: John, Age: 25, Salary: 50000.50
        // printf allows you to format the output using format specifiers.
        // %s - String, %d - integer, %.2f - floating-point number with 2 decimal places

        System.out.println(""); // Moving to the next line for clarity
        
        System.out.print("... END ...");

    }
}
