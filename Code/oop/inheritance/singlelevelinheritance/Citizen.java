//Base class
package core.oop.inheritance.singlelevelinheritance;

public class Citizen {
	// Data members
	private long addarno;
	private String name;
	private String address;

	// constructor
	public Citizen() {
		super();
	}

	public Citizen(long addarno, String name, String address) {
		super();
		this.addarno = addarno;
		this.name = name;
		this.address = address;
	}

	// getter setter
	public long getAddarno() {
		return addarno;
	}

	public void setAddarno(long addarno) {
		this.addarno = addarno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	// to string
	@Override
	public String toString() {
		return "Citizen [addarno=" + addarno + ", name=" + name + ", address=" + address + "]";
	}

}
