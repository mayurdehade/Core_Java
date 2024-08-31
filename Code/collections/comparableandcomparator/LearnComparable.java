package core.collections.comparableandcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//Comparable

public class LearnComparable {

	public static void main(String[] args) {
		
		Animal d1 = new Animal(2, "Raju", 5);
		Animal d2 = new Animal(5, "Coco", 4);
		Animal d3 = new Animal(1, "Bruno", 2);
		Animal d4 = new Animal(3, "Maxo", 8);
		Animal d5 = new Animal(4, "Don", 7);
		Animal d6 = new Animal(3, "Rocky", 2);
		
		//adding elements in ArrayList
		List<Animal> dog = new ArrayList<>();
		dog.add(d1);
		dog.add(d2);
		dog.add(d3);
		dog.add(d4);
		dog.add(d5);
		dog.add(d6);
		
		System.out.println(dog);
		//before sorting
		//[Animal [age=2, name=Raju, weight=5]
		//Animal [age=5, name=Coco, weight=4]
		//Animal [age=1, name=Bruno, weight=2]
		//Animal [age=3, name=Maxo, weight=8]
		//Animal [age=4, name=Don, weight=7]
		//Animal [age=3, name=Rocky, weight=2]]
		
		Collections.sort(dog);
		
		System.out.println(dog);
		//after sorting
		//[Animal [age=1, name=Bruno, weight=2]
		//Animal [age=2, name=Raju, weight=5]
		//Animal [age=3, name=Maxo, weight=8]
		//Animal [age=3, name=Rocky, weight=2]
		//Animal [age=4, name=Don, weight=7]
		//Animal [age=5, name=Coco, weight=4]]
		
	}

}
