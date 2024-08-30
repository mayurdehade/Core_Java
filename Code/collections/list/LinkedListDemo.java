package core.collections.list;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {

        // Creating a LinkedList
        // LinkedList is a class that implements both the List and Deque interfaces.
        // It is a doubly-linked list, meaning each element (Node) points to both the previous and next elements.
        List<String> linkedList = new LinkedList<>();

        // Adding elements to the LinkedList
        // The add() method appends elements to the end of the list.
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        // Adding an element at a specific position
        linkedList.add(1, "Orange"); // Adds "Orange" at index 1

        // Displaying the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Accessing elements in the LinkedList
        // The get() method retrieves the element at a specific index.
        String firstElement = linkedList.get(0);
        System.out.println("First element: " + firstElement);

        // Updating elements in the LinkedList
        // The set() method replaces the element at a specific index with a new value.
        linkedList.set(2, "Mango"); // Replaces "Banana" with "Mango" at index 2
        System.out.println("Updated LinkedList: " + linkedList);

        // Removing elements from the LinkedList
        // The remove() method removes the element at the specified index or the first occurrence of the specified element.
        linkedList.remove(1); // Removes the element at index 1 ("Orange")
        linkedList.remove("Apple"); // Removes the first occurrence of "Apple"
        System.out.println("LinkedList after removals: " + linkedList);

        // Iterating over the LinkedList using a for-each loop
        System.out.println("Iterating using for-each loop:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }

        // Iterating over the LinkedList using an Iterator
        // Iterator is useful when you need to remove elements during iteration.
        System.out.println("Iterating using Iterator:");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
            if (fruit.equals("Mango")) {
                iterator.remove(); // Removes "Mango" from the list
            }
        }
        System.out.println("LinkedList after Iterator removal: " + linkedList);

        // Checking if the LinkedList contains an element
        boolean containsCherry = linkedList.contains("Cherry");
        System.out.println("LinkedList contains 'Cherry': " + containsCherry);

        // Getting the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of the LinkedList: " + size);

        // Clearing the LinkedList
        linkedList.clear(); // Removes all elements from the list
        System.out.println("LinkedList after clear: " + linkedList);

        // LinkedList as a Deque (Double-Ended Queue)
        LinkedList<String> deque = new LinkedList<>();
        
        // Adding elements to the front and back
        deque.addFirst("Front Element"); // Adds at the front
        deque.addLast("Back Element");   // Adds at the back
        
        // Retrieving elements from the front and back
        String first = deque.getFirst();
        String last = deque.getLast();
        System.out.println("Deque first element: " + first);
        System.out.println("Deque last element: " + last);
        
        // Removing elements from the front and back
        deque.removeFirst(); // Removes from the front
        deque.removeLast();  // Removes from the back
        System.out.println("Deque after removals: " + deque);
    }
}
