package core.collections.comparableandcomparator;

//implements comparable interface
public class Animal implements Comparable<Animal> {

	int age;
	String name;
	int weight;

	public Animal(int age, String name, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]\n";
	}

	// Unimplemented method in this we proved sorting logic
	@Override
	public int compareTo(Animal that) {

		if (this.name == that.name) {
			// string class implementing the comparable interface
			// it have compareTo method
			return this.name.compareTo(that.name);
		}

		// compare current object age with given object age
		return this.age - that.age;
	}

}
