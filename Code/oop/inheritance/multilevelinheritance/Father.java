//Child class derived from GrandFather
//Parent class of Son
package core.oop.inheritance.multilevelinheritance;

public class Father extends GrandFather {
	// data members
	private String fname;
	private int fProperty;

	// Getter and Setter
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getfProperty() {
		return fProperty;
	}

	public void setfProperty(int fProperty) {
		this.fProperty = fProperty;
	}

	@Override
	public String toString() {
		return "Father [fname=" + fname + ", fProperty=" + fProperty + ", toString()=" + super.toString() + "]";
	}

}
