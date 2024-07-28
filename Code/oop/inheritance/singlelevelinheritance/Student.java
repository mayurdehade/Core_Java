//Derived class
package core.oop.inheritance.singlelevelinheritance;

//Student derived from Citizen
public class Student extends Citizen {
	// Data members
	private int roll;
	private char std;

	// constructor
	public Student() {
		super();
	}

	public Student(int roll, char std) {
		super();
		this.roll = roll;
		this.std = std;
	}

	// Getters and Setters
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public char getStd() {
		return std;
	}

	public void setStd(char std) {
		this.std = std;
	}

	//to string which accessing inherited methods
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", std=" + std + ", getAddarno()=" + getAddarno() + ", getName()=" + getName()
				+ ", getAddress()=" + getAddress() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	

	

}
