package core.collections.set;

import java.util.HashSet;

//Order: HashSet - No order; LinkedHashSet - Insertion order; TreeSet - Sorted order.
//Performance: HashSet is typically faster (O(1)), LinkedHashSet has slightly more overhead (O(1) with order), and TreeSet is slower due to sorting (O(log n)).
//Null Handling: HashSet and LinkedHashSet allow one null element, while TreeSet does not allow null at all.

public class HashSetDemo {

	public static void main(String[] args) {
		
        // Create a HashSet of Integer type
        HashSet<Integer> hs = new HashSet<Integer>();
        
        // Add elements to the HashSet
        // HashSet doesn't maintain insertion order
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        
        // Display the elements in the HashSet
        System.out.println("Initial HashSet: " + hs);
        
        // Remove an element from the HashSet using remove() method
        // The element to be removed must be specified
        hs.remove(10);
        System.out.println("HashSet after removing 10: " + hs);
        
        // Check if a particular element exists in the HashSet using contains() method
        boolean contains30 = hs.contains(30);
        System.out.println("Does the HashSet contain 30? " + contains30);
        
        // Find the size of the HashSet using size() method
        int setSize = hs.size();
        System.out.println("Size of the HashSet: " + setSize);
        
        // Iterate over the HashSet using an enhanced for loop
        System.out.print("Iterating over HashSet: ");
        for (Integer element : hs) {
            System.out.print(element + " ");
        }
        System.out.println();
        
        // Check if the HashSet is empty using isEmpty() method
        boolean isEmpty = hs.isEmpty();
        System.out.println("Is the HashSet empty? " + isEmpty);
        
        // Clear all elements from the HashSet using clear() method
        hs.clear();
        System.out.println("HashSet after clearing all elements: " + hs);
        
        // Check if the HashSet is empty after clearing
        isEmpty = hs.isEmpty();
        System.out.println("Is the HashSet empty after clearing? " + isEmpty);
        
        
	}

}
