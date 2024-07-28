//Child class 1
package core.oop.inheritance.hierarchicalinheritance;

public class Child1 extends Father {
	// data members
	private String c1Name;

	// getter setter
	public String getC1Name() {
		return c1Name;
	}

	public void setC1Name(String c1Name) {
		this.c1Name = c1Name;
	}

	@Override
	public String toString() {
		return "Child1 [c1Name=" + c1Name + ", toString()=" + super.toString() + "]";
	}

}
