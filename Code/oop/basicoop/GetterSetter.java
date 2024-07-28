//Getter Setter demo
package core.oop.basicoop;

class Bank {
	private String username;
	private String password;
	public float balance;
	
	//Getter and Setters
	//Setter -> set values
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	//Getter -> get values
	public String getUsername() {
		return this.username;
	}
}

public class GetterSetter {

	public static void main(String[] args) {
		//create the object of the bank class
		Bank b = new Bank();
		b.setUsername("Mayur");
		b.setPassword("Mayur@123");
		b.balance = 10000.39f;
		
		System.out.println(b.getUsername());
		System.out.println(b.balance);
	}

}
