package core.collections.comparableandcomparator;

//Animal class implementing Comparable interface
//The Comparable interface is used here to define the natural ordering of Animal objects based on the `age` field.

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

	// Overriding the compareTo method to define sorting logic
    // This method sorts Animal objects based on their `age` in ascending order.
    @Override
    public int compareTo(Animal other) {
        return this.age - other.age;  // returns a positive number if this.age > other.age, 0 if equal, negative if this.age < other.age
    }

    // Overriding toString method to display the Animal object in a readable format
    @Override
    public String toString() {
        return "Animal [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }

}
