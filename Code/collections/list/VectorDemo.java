package core.collections.list;
import java.util.Vector;
import java.util.Iterator;

public class VectorDemo {

    public static void main(String[] args) {

    	// Creating a Vector
        // Vector is a legacy class that implements the List interface.
        // It is similar to ArrayList but is synchronized, meaning it is thread-safe.
        Vector<String> vector = new Vector<>();

        // Adding elements to the Vector
        // The add() method appends elements to the end of the Vector.
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Adding an element at a specific position
        vector.add(1, "Orange"); // Adds "Orange" at index 1

        // Displaying the Vector
        System.out.println("Vector: " + vector);

        // Accessing elements in the Vector
        // The get() method retrieves the element at a specific index.
        String firstElement = vector.get(0);
        System.out.println("First element: " + firstElement);

        // Updating elements in the Vector
        // The set() method replaces the element at a specific index with a new value.
        vector.set(2, "Mango"); // Replaces "Banana" with "Mango" at index 2
        System.out.println("Updated Vector: " + vector);

        // Removing elements from the Vector
        // The remove() method removes the element at the specified index or the first occurrence of the specified element.
        vector.remove(1); // Removes the element at index 1 ("Orange")
        vector.remove("Apple"); // Removes the first occurrence of "Apple"
        System.out.println("Vector after removals: " + vector);

        // Iterating over the Vector using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Iterating over the Vector using an Iterator
        // Iterator is useful when you need to remove elements during iteration.
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("Mango")) {
                iterator.remove(); // Removes "Mango" from the Vector
            }
        }
        System.out.println("Vector after Iterator removal: " + vector);

        // Checking if the Vector contains an element
        boolean containsCherry = vector.contains("Cherry");
        System.out.println("Vector contains 'Cherry': " + containsCherry);

        // Getting the size of the Vector
        int size = vector.size();
        System.out.println("Size of the Vector: " + size);

        // Checking the capacity of the Vector
        // Vectors have a capacity, which is the number of elements it can hold before resizing.
        int capacity = vector.capacity();
        System.out.println("Capacity of the Vector: " + capacity);

        // Clearing the Vector
        vector.clear(); // Removes all elements from the Vector
        System.out.println("Vector after clear: " + vector);

        // Creating a Vector with an initial capacity and capacity increment
        Vector<Integer> numbers = new Vector<>(5, 3); // Initial capacity is 5, increment by 3 when resized
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        
        // Displaying the Vector and its capacity after reaching initial capacity
        System.out.println("Numbers Vector: " + numbers);
        System.out.println("Capacity after adding 5 elements: " + numbers.capacity());

        // Adding more elements to trigger the capacity increment
        numbers.add(6);
        numbers.add(7);
        System.out.println("Numbers Vector after adding more elements: " + numbers);
        System.out.println("Capacity after adding 7 elements: " + numbers.capacity());
    }
}
