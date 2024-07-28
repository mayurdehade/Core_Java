//Base class
package core.oop.inheritance.multilevelinheritance;

public class GrandFather {
	// data members
	private int property;
	private String name;

	// Getter and Setter
	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "GrandFather [property=" + property + ", name=" + name + "]";
	}

}
