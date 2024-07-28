//Child class 2
package core.oop.inheritance.hierarchicalinheritance;

public class Child2 extends Father {
	// data members
	private String c2Name;

	//getter setter
	public String getC2Name() {
		return c2Name;
	}

	public void setC2Name(String c2Name) {
		this.c2Name = c2Name;
	}

	@Override
	public String toString() {
		return "Child2 [c2Name=" + c2Name + ", toString()=" + super.toString() + "]";
	}
}
