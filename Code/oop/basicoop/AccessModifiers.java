package core.oop.basicoop;

class BankAccount {
	public String username;
	private String pass;

	// Setter for set the pass value
	// password is private data member and it its not accessible outside class
	public void setPass(String password) {
		pass = password;
	}
}

public class AccessModifiers {

	public static void main(String[] args) {
		// Creating the obj of the BankAccount class
		BankAccount b = new BankAccount();
		b.username = "mayurdehade";
		b.setPass("Mayur@12345");

		System.out.println(b.username);
	}

}
