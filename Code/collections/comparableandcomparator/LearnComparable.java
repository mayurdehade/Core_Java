package core.collections.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Comparable Interface Example
// This class demonstrates the usage of the Comparable interface to sort a list of Animal objects based on the `age` field.

public class LearnComparable {

    public static void main(String[] args) {
        
        // Creating Animal objects with age, name, and weight attributes
        Animal d1 = new Animal(2, "Raju", 5);
        Animal d2 = new Animal(5, "Coco", 4);
        Animal d3 = new Animal(1, "Bruno", 2);
        Animal d4 = new Animal(3, "Maxo", 8);
        Animal d5 = new Animal(4, "Don", 7);
        Animal d6 = new Animal(3, "Rocky", 2);
        
        // Adding Animal objects to an ArrayList
        List<Animal> animals = new ArrayList<>();
        animals.add(d1);
        animals.add(d2);
        animals.add(d3);
        animals.add(d4);
        animals.add(d5);
        animals.add(d6);
        
        // Displaying the list before sorting
        System.out.println("Before Sorting:");
        System.out.println(animals);
        // Expected output:
        // [Animal [age=2, name=Raju, weight=5],
        //  Animal [age=5, name=Coco, weight=4],
        //  Animal [age=1, name=Bruno, weight=2],
        //  Animal [age=3, name=Maxo, weight=8],
        //  Animal [age=4, name=Don, weight=7],
        //  Animal [age=3, name=Rocky, weight=2]]

        // Sorting the list using Collections.sort()
        // This will sort the Animal objects based on the `compareTo` method defined in the Animal class
        Collections.sort(animals);
        
        // Displaying the list after sorting
        System.out.println("After Sorting:");
        System.out.println(animals);
        // Expected output (sorted by age in ascending order):
        // [Animal [age=1, name=Bruno, weight=2],
        //  Animal [age=2, name=Raju, weight=5],
        //  Animal [age=3, name=Maxo, weight=8],
        //  Animal [age=3, name=Rocky, weight=2],
        //  Animal [age=4, name=Don, weight=7],
        //  Animal [age=5, name=Coco, weight=4]]
    }
}

