package core.collections.list;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		 // Creating a Stack object to store strings representing fruits
        Stack<String> fruits = new Stack<String>();
        
        // push() method: Adds elements to the top of the stack (Last-In)
        fruits.push("1 Apple");
        fruits.push("2 Banana");
        fruits.push("3 Mango");
        fruits.push("4 Kiwi");
        fruits.push("5 Papaya");
        
        // peek() method: Returns the top element of the stack without removing it
        System.out.println("Top element (peek): " + fruits.peek());
        
        // Printing the entire stack to see the order of elements
        System.out.println("Stack content: " + fruits);
        
        // pop() method: Removes and returns the top element of the stack
        System.out.println("\nPopping elements from the stack:");
        while (!fruits.isEmpty()) {
            System.out.println(fruits.pop());
        }
        
        // empty() method: Checks if the stack is empty
        System.out.println("\nIs the stack empty? " + fruits.empty());
        
        // Let's add the elements back for further demonstration
        fruits.push("1 Apple");
        fruits.push("2 Banana");
        fruits.push("3 Mango");
        fruits.push("4 Kiwi");
        fruits.push("5 Papaya");
        
        // search(Object o) method: Returns the 1-based position from the top of the stack
        // If the element is not found, it returns -1
        System.out.println("\nPosition of '3 Mango': " + fruits.search("3 Mango"));
        System.out.println("Position of '6 Orange': " + fruits.search("6 Orange")); // Element not in stack
        
        // contains(Object o) method: Returns true if the stack contains the specified element
        System.out.println("\nDoes the stack contain '2 Banana'? " + fruits.contains("2 Banana"));
        System.out.println("Does the stack contain '6 Orange'? " + fruits.contains("6 Orange"));
        
        // size() method: Returns the number of elements in the stack
        System.out.println("\nSize of the stack: " + fruits.size());
        
        // elementAt(int index) method: Returns the element at the specified index in the stack
        // Note: Stack indexes start from 0 at the bottom of the stack to size-1 at the top
        System.out.println("\nElement at index 2: " + fruits.elementAt(2));
        
        // clear() method: Removes all elements from the stack
        fruits.clear();
        System.out.println("\nStack after clear(): " + fruits);

	}

}
