package core.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		 // Create a LinkedHashSet of Integer type
        // LinkedHashSet maintains the insertion order
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        
        // Add elements to the LinkedHashSet
        // Elements are added in the order: 10, 20, 50, 40, 30
        lhs.add(10);
        lhs.add(20);
        lhs.add(50);
        lhs.add(40);
        lhs.add(30);
        
        // Display the elements of the LinkedHashSet
        // The elements will be displayed in the same order they were inserted
        System.out.println("LinkedHashSet (insertion order): " + lhs);
        
        // Iterate over the LinkedHashSet using an enhanced for loop
        // The iteration will follow the insertion order
        System.out.println("Iterating over LinkedHashSet:");
        for (Integer number : lhs) {
            System.out.println(number);
        }
        
        // Remove an element from the LinkedHashSet using remove() method
        // The specified element (20) is removed
        lhs.remove(20);
        System.out.println("LinkedHashSet after removing 20: " + lhs);
        
        // Check if a particular element exists in the LinkedHashSet using contains() method
        boolean contains50 = lhs.contains(50);
        System.out.println("Does the LinkedHashSet contain 50? " + contains50);
        
        // Find the size of the LinkedHashSet using size() method
        int setSize = lhs.size();
        System.out.println("Size of the LinkedHashSet: " + setSize);
        
        // Check if the LinkedHashSet is empty using isEmpty() method
        boolean isEmpty = lhs.isEmpty();
        System.out.println("Is the LinkedHashSet empty? " + isEmpty);
        
        // Clear all elements from the LinkedHashSet using clear() method
        lhs.clear();
        System.out.println("LinkedHashSet after clearing all elements: " + lhs);

	}

}
