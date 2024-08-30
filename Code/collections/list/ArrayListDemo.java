package core.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        
        // Collection Interface Methods

        // List is an interface, so we can't create an object of List directly.
        // ArrayList is a class, so we can create an object of ArrayList.
        List<Integer> list = new ArrayList<>();
        
        List<Integer> list2 = new ArrayList<>();

        // Adding elements using add() method
        // List can contain duplicate elements.
        // Lists are dynamic in nature; they automatically increase their size.
        // Elements are inserted at the end of the list. The time complexity for adding an element is O(n) in the worst case due to array resizing.
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(10);

        System.out.println("List elements: " + list);

        // Get the size of the list
        System.out.println("Size of the list: " + list.size());

        // Check if the list contains specific elements
        // contains() checks if the element exists in the list and returns true if found, false otherwise.
        System.out.println("List contains 10: " + list.contains(10)); // true
        System.out.println("List contains 100: " + list.contains(100)); // false

        // Remove element by index
        // The remove(int index) method removes the element at the specified index. 
        // The list is then shifted left to fill the gap, which has a time complexity of O(n).
        list.remove(1); // Removes the element at index 1

        // Remove element by value
        // The remove(Object o) method removes the first occurrence of the specified element.
        // If the element is not found, the list remains unchanged. The search operation is O(n).
        list.remove(Integer.valueOf(10)); // Removes the first occurrence of the element 10

        System.out.println("List elements after removal: " + list);
    
        // addAll() copies all elements from one list to another.
        // This method appends the elements of the specified collection to the end of the list.
        list2.addAll(list);
        
        System.out.println("List2 elements after addAll: " + list2);
        
        // removeAll() removes all elements in the second list that are present in the first list.
        // list2.removeAll(list); // Uncomment to remove all elements in list2 that are present in list
        
        // retainAll() retains only the elements in this list that are contained in the specified collection.
        // This is useful for finding the intersection of two lists.
        list.retainAll(list2);
        
        System.out.println("List elements after retainAll: " + list);
    
        // clear() removes all elements from the list, leaving it empty.
        list.clear();
        
        System.out.println("List elements after clear: " + list);
        
        // convert list into an array
        // toArray() converts the list to a new array. Useful when an array is needed instead of a list.
        Object arr[] = list2.toArray();
        
        // Print the array elements
        for(Object a : arr) 
            System.out.print(a + " ");
        
        System.out.println("\n");
        
        //***********************************************
        
        // List Interface Methods

        // get() retrieves the element at the specified index.
        // Accessing elements by index has a time complexity of O(1).
        System.out.println("Element at index 1 in list2: " + list2.get(1));
        
        // set() replaces the element at the specified index with a new value.
        // The old value is returned. The time complexity is O(n) in the worst case.
        list2.set(1, 200);
        
        // add() inserts the element at the specified index.
        // Shifts the element currently at that position (if any) and any subsequent elements to the right.
        list2.add(2, 1000);
        
        // remove() removes the element at the specified index.
        list2.remove(1); // Removes the element at index 1
        
        System.out.println("List2 elements after modifications: " + list2);
        
        // indexOf() returns the index of the first occurrence of the specified element, or -1 if the list does not contain the element.
        // This method performs a linear search and has a time complexity of O(n).
        System.out.println("Index of 30 in list2: " + list2.indexOf(30));
        
        // lastIndexOf() returns the index of the last occurrence of the specified element in this list,
        // or -1 if the list does not contain the element. This method also has a time complexity of O(n).
        System.out.println("Last index of 10 in list2: " + list2.lastIndexOf(10));
        
        // Iterating over the ArrayList
        
        // Using a simple for loop
        List<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Papaya");
        
        // By using a simple for loop
        // This is useful when you need to work with the index values as well.
        for(int i = 0; i < fruits.size(); i++) {
            System.out.println("for loop fruit: " + fruits.get(i));
        }
        
        // By using a for-each loop (enhanced for loop)
        // This is more readable and avoids the overhead of calling get() in a loop.
        for(String fruit : fruits) 
            System.out.println("for each fruit: " + fruit);

        // Using Iterator
        // Iterator is an interface in Java that provides methods to iterate over any Collection.
        // It provides a way to loop through the elements of the collection sequentially without exposing the underlying implementation.
        Iterator<String> fe = fruits.iterator();
        
        Iterator<String> fe1 = fruits.listIterator(); //it is used for list
        //listIterator() returns a list iterator over the element in the list
        
        //subList() return sublist
        //first in inclusive and second is exclusive
        List<String> sublist = fruits.subList(1, 3); //[Apple, Mango]
        
        System.out.println("Sublist: "+sublist); //
        
        // hasNext() method checks if the Iterator has more elements.
        while(fe.hasNext()) {
            // next() method returns the next element in the collection.
            // It also advances the iterator position.
            System.out.println("iterator fruit: " + fe.next());
        }

        // Removing elements using Iterator
        // Iterator allows safe removal of elements during iteration using its remove() method.
        // This avoids ConcurrentModificationException, which occurs when trying to modify the collection directly while iterating over it.
        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()) {
            String fruit = iterator.next();
            if(fruit.equals("Apple")) {
                // remove() method removes the last element returned by the iterator.
                iterator.remove();
            }
        }
        
        
        
        System.out.println("Fruits after removing Apple using Iterator: " + fruits);
    }
}
