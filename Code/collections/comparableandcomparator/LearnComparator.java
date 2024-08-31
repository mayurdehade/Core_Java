package core.collections.comparableandcomparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import core.oop.inheritance.dynamicmethoddispatch.A;

//we can define a custom class for comparison or use anonymous class
class MyCustomDogComparator implements Comparator<Animal> {

	@Override
	public int compare(Animal o1, Animal o2) {
		// using of this having issue sometime
//		return o1.weight - o2.weight;

		// use of compare method
		return Integer.compare(o1.weight, o2.weight);
	}

}

public class LearnComparator {

	public static void main(String[] args) {

		Animal d1 = new Animal(2, "Raju", 5);
		Animal d2 = new Animal(5, "Coco", 4);
		Animal d3 = new Animal(1, "Bruno", 2);
		Animal d4 = new Animal(3, "Maxo", 8);
		Animal d5 = new Animal(4, "Don", 7);
		Animal d6 = new Animal(3, "Rocky", 10);

		// adding elements in ArrayList
		List<Animal> dog = new ArrayList<>();
		dog.add(d1);
		dog.add(d2);
		dog.add(d3);
		dog.add(d4);
		dog.add(d5);
		dog.add(d6);

		System.out.println(dog);
		// [Animal [age=2, name=Raju, weight=5]
		// Animal [age=5, name=Coco, weight=4]
		// Animal [age=1, name=Bruno, weight=2]
		// Animal [age=3, name=Maxo, weight=8]
		// Animal [age=4, name=Don, weight=7]
		// Animal [age=3, name=Rocky, weight=10]]

		Collections.sort(dog, new MyCustomDogComparator());

		System.out.println(dog);
		// sorted using weight
		// [Animal [age=1, name=Bruno, weight=2]
		// Animal [age=5, name=Coco, weight=4]
		// Animal [age=2, name=Raju, weight=5]
		// Animal [age=4, name=Don, weight=7]
		// Animal [age=3, name=Maxo, weight=8]
		// Animal [age=3, name=Rocky, weight=10]]

		// Anonymous class
		Collections.sort(dog, new Comparator<Animal>() {

			@Override
			public int compare(Animal o1, Animal o2) {
				return o1.name.compareTo(o2.name);
			}
		});

		System.out.println(dog);
		// sorted using name
		// [Animal [age=1, name=Bruno, weight=2]
		// Animal [age=5, name=Coco, weight=4]
		// Animal [age=4, name=Don, weight=7]
		// Animal [age=3, name=Maxo, weight=8]
		// Animal [age=2, name=Raju, weight=5]
		// Animal [age=3, name=Rocky, weight=10]]

		// this is list interface method for sorting
		// lambda function for comparison of two objects
		dog.sort((a, b) -> Integer.compare(a.age, b.age));

		// sorting using age in descending order
		Collections.sort(dog, Collections.reverseOrder());

		System.out.println(dog);

		// sorting based on name
		Collections.sort(dog, Comparator.comparing(Animal::getName));

		System.out.println(dog);
		// sorted using name
		// [Animal [age=1, name=Bruno, weight=2]
		// Animal [age=5, name=Coco, weight=4]
		// Animal [age=4, name=Don, weight=7]
		// Animal [age=3, name=Maxo, weight=8]
		// Animal [age=2, name=Raju, weight=5]
		// Animal [age=3, name=Rocky, weight=10]]

		Collections.sort(dog, (o1, o2) -> {
			return o1.weight - o2.weight;
		});

		System.out.println(dog);
		// sorted using weight
		// [Animal [age=1, name=Bruno, weight=2]
		// Animal [age=5, name=Coco, weight=4]
		// Animal [age=2, name=Raju, weight=5]
		// Animal [age=4, name=Don, weight=7]
		// Animal [age=3, name=Maxo, weight=8]
		// Animal [age=3, name=Rocky, weight=10]]
		
		
		//Sorting 2D matrix on first element of subarray
		int arr[][] = {
				{4,8,2},
				{2,4,3},
				{8,2,1}
		};
		
		Arrays.sort(arr, (n1, n2) -> {
			return n1[0] - n2[0];
		});
		
		for(int a[] : arr) {
			for(int e: a) {
				System.out.print(e +" ");
			}
			System.out.println();
		}
		
		//output:
		//2 4 3 
		//4 8 2 
		//8 2 1
	}

}
