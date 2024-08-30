package core.collections.quque;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {
	//Linked List is implemented both Queue and List interface.
	public static void main(String[] args) {
		// Creating a Queue using LinkedList
        Queue<Integer> integers = new LinkedList<>();

        // offer() method: Adds an element to the queue. Returns true if successful, false otherwise.
        // This method is preferred for adding elements because it doesn't throw an exception.
        integers.offer(10);
        integers.offer(20);
        integers.offer(30);
        integers.offer(40);
        integers.offer(50);

        // element() method: Returns the head of the queue without removing it.
        // Throws NoSuchElementException if the queue is empty.
        System.out.println("Head of the queue using element(): " + integers.element());

        // peek() method: Returns the head of the queue without removing it.
        // Returns null if the queue is empty.
        System.out.println("Head of the queue using peek(): " + integers.peek());

        // size() method: Returns the number of elements in the queue.
        System.out.println("Size of the queue: " + integers.size());

        // isEmpty() method: Checks if the queue is empty. Returns true if empty, false otherwise.
        System.out.println("Is the queue empty? " + integers.isEmpty());

        // contains(Object o) method: Checks if the queue contains the specified element.
        // Returns true if the element is found, false otherwise.
        System.out.println("Does the queue contain 30? " + integers.contains(30));

        // poll() method: Retrieves and removes the head of the queue. Returns null if the queue is empty.
        System.out.println("\nPolling elements from the queue:");
        while (!integers.isEmpty()) {
            // Retrieves and removes the head element, printing each one
            System.out.println(integers.poll());
        }

        // After polling all elements, the queue should be empty.
        System.out.println("\nIs the queue empty after polling? " + integers.isEmpty());

        // Attempt to use poll(), peek(), and element() on an empty queue
        System.out.println("Polling from an empty queue: " + integers.poll()); // Returns null
        System.out.println("Peeking from an empty queue: " + integers.peek()); // Returns null
        try {
            System.out.println("Element from an empty queue: " + integers.element()); // Throws NoSuchElementException
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        }

        // add() method: Similar to offer(), but it throws an IllegalStateException if the queue is full.
        // This isn't usually a concern with LinkedList, as it's dynamically resizable.
        integers.add(60);
        integers.add(70);

        System.out.println("\nQueue after adding elements: " + integers);

        // remove() method: Removes and returns the head of the queue.
        // Throws NoSuchElementException if the queue is empty.
        System.out.println("Removed element: " + integers.remove());

        System.out.println("Queue after removing the head element: " + integers);
	}
}
