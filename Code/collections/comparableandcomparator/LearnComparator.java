package core.collections.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Custom Comparator class to compare Animal objects based on weight
class MyCustomDogComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        // It's safer to use Integer.compare to avoid overflow issues with large values
        return Integer.compare(o1.weight, o2.weight);
    }
}

public class LearnComparator {

    public static void main(String[] args) {

        // Creating Animal objects with age, name, and weight attributes
        Animal d1 = new Animal(2, "Raju", 5);
        Animal d2 = new Animal(5, "Coco", 4);
        Animal d3 = new Animal(1, "Bruno", 2);
        Animal d4 = new Animal(3, "Maxo", 8);
        Animal d5 = new Animal(4, "Don", 7);
        Animal d6 = new Animal(3, "Rocky", 10);

        // Adding Animal objects to an ArrayList
        List<Animal> dogs = new ArrayList<>();
        dogs.add(d1);
        dogs.add(d2);
        dogs.add(d3);
        dogs.add(d4);
        dogs.add(d5);
        dogs.add(d6);

        // Displaying the list before sorting
        System.out.println("Before Sorting:");
        System.out.println(dogs);
        // Expected output (insertion order):
        // [Animal [age=2, name=Raju, weight=5],
        //  Animal [age=5, name=Coco, weight=4],
        //  Animal [age=1, name=Bruno, weight=2],
        //  Animal [age=3, name=Maxo, weight=8],
        //  Animal [age=4, name=Don, weight=7],
        //  Animal [age=3, name=Rocky, weight=10]]

        // Sorting using a custom comparator that sorts based on weight
        Collections.sort(dogs, new MyCustomDogComparator());

        System.out.println("After Sorting by Weight:");
        System.out.println(dogs);
        // Expected output (sorted by weight):
        // [Animal [age=1, name=Bruno, weight=2],
        //  Animal [age=5, name=Coco, weight=4],
        //  Animal [age=2, name=Raju, weight=5],
        //  Animal [age=4, name=Don, weight=7],
        //  Animal [age=3, name=Maxo, weight=8],
        //  Animal [age=3, name=Rocky, weight=10]]

        // Sorting using an anonymous class that sorts based on name
        Collections.sort(dogs, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.name.compareTo(o2.name); // Compare names lexicographically
            }
        });

        System.out.println("After Sorting by Name:");
        System.out.println(dogs);
        // Expected output (sorted by name):
        // [Animal [age=1, name=Bruno, weight=2],
        //  Animal [age=5, name=Coco, weight=4],
        //  Animal [age=4, name=Don, weight=7],
        //  Animal [age=3, name=Maxo, weight=8],
        //  Animal [age=2, name=Raju, weight=5],
        //  Animal [age=3, name=Rocky, weight=10]]

        // Sorting using a lambda expression to sort by age in ascending order
        dogs.sort((a, b) -> Integer.compare(a.age, b.age));

        System.out.println("After Sorting by Age:");
        System.out.println(dogs);
        // Expected output (sorted by age):
        // [Animal [age=1, name=Bruno, weight=2],
        //  Animal [age=2, name=Raju, weight=5],
        //  Animal [age=3, name=Maxo, weight=8],
        //  Animal [age=3, name=Rocky, weight=10],
        //  Animal [age=4, name=Don, weight=7],
        //  Animal [age=5, name=Coco, weight=4]]

        // Sorting using reverse order based on natural ordering (age, defined by Comparable)
        Collections.sort(dogs, Collections.reverseOrder());

        System.out.println("After Reverse Order Sorting by Age:");
        System.out.println(dogs);
        // Expected output (sorted by age in descending order):
        // [Animal [age=5, name=Coco, weight=4],
        //  Animal [age=4, name=Don, weight=7],
        //  Animal [age=3, name=Maxo, weight=8],
        //  Animal [age=3, name=Rocky, weight=10],
        //  Animal [age=2, name=Raju, weight=5],
        //  Animal [age=1, name=Bruno, weight=2]]

        // Sorting using method reference to compare by name
        Collections.sort(dogs, Comparator.comparing(Animal::getName));

        System.out.println("After Sorting by Name using Method Reference:");
        System.out.println(dogs);
        // Expected output (sorted by name):
        // [Animal [age=1, name=Bruno, weight=2],
        //  Animal [age=5, name=Coco, weight=4],
        //  Animal [age=4, name=Don, weight=7],
        //  Animal [age=3, name=Maxo, weight=8],
        //  Animal [age=2, name=Raju, weight=5],
        //  Animal [age=3, name=Rocky, weight=10]]

        // Sorting using lambda expression by weight (alternative approach)
        Collections.sort(dogs, (o1, o2) -> o1.weight - o2.weight);

        System.out.println("After Sorting by Weight (Lambda):");
        System.out.println(dogs);
        // Expected output (sorted by weight):
        // [Animal [age=1, name=Bruno, weight=2],
        //  Animal [age=5, name=Coco, weight=4],
        //  Animal [age=2, name=Raju, weight=5],
        //  Animal [age=4, name=Don, weight=7],
        //  Animal [age=3, name=Maxo, weight=8],
        //  Animal [age=3, name=Rocky, weight=10]]
        
        // Sorting a 2D array based on the first element of each subarray
        int arr[][] = {
                {4, 8, 2},
                {2, 4, 3},
                {8, 2, 1}
        };

        // Sorting using lambda expression based on the first element of each row
        Arrays.sort(arr, (n1, n2) -> n1[0] - n2[0]);

        System.out.println("2D Array Sorted by First Element:");
        for(int[] row : arr) {
            for(int e: row) {
                System.out.print(e + " ");
            }
            System.out.println();
        }
        // Expected output:
        // 2 4 3 
        // 4 8 2 
        // 8 2 1 
    }
}
