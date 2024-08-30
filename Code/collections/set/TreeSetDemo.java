package core.collections.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		 // Create a TreeSet of Integer type
        // TreeSet automatically sorts the elements in natural order (ascending for numbers)
        TreeSet<Integer> ts = new TreeSet<Integer>();

        // Add elements to the TreeSet
        ts.add(10);
        ts.add(20);
        ts.add(50);
        ts.add(40);
        ts.add(30);

        // Display the elements of the TreeSet
        // The elements are stored in a sorted order
        System.out.println("TreeSet (sorted): " + ts);
        
        // Iterate over the TreeSet using an enhanced for loop
        // The elements will be printed in sorted order
        System.out.println("Iterating over TreeSet:");
        for (Integer number : ts) {
            System.out.println(number);
        }

        // Remove an element from the TreeSet using remove() method
        // The specified element (10) is removed
        ts.remove(10);
        System.out.println("TreeSet after removing 10: " + ts);
        
        // Get the first (lowest) element using first() method
        Integer firstElement = ts.first();
        System.out.println("First (lowest) element in TreeSet: " + firstElement);

        // Get the last (highest) element using last() method
        Integer lastElement = ts.last();
        System.out.println("Last (highest) element in TreeSet: " + lastElement);

        // Check if the TreeSet contains a particular element using contains() method
        boolean contains30 = ts.contains(30);
        System.out.println("Does the TreeSet contain 30? " + contains30);
        
        // Get a subset of the TreeSet using subSet() method
        // This retrieves elements between 20 (inclusive) and 50 (exclusive)
        TreeSet<Integer> subSet = (TreeSet<Integer>) ts.subSet(20, 50);
        System.out.println("Subset of TreeSet from 20 to 50 (exclusive): " + subSet);

        // Clear all elements from the TreeSet using clear() method
        ts.clear();
        System.out.println("TreeSet after clearing all elements: " + ts);
	}

}
