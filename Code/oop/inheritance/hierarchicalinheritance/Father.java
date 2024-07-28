//Parent class
package core.oop.inheritance.hierarchicalinheritance;

public class Father {
	//data members
	private String fatherName = "BruceLee";
	private String surname = "Marke";
	
	//getter setter
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@Override
	public String toString() {
		return "Father [fatherName=" + fatherName + ", surname=" + surname + "]";
	}
	
	
}
