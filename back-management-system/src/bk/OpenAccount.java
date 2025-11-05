package bk;

public class OpenAccount {
	
	int accountNumber;
	String accountHolderName;
	String address;
	String phoneNumber;
	String email;
	double initialBalance;
	

	public void DisplayAccountDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Holder Name: " + accountHolderName);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email: " + email);
		System.out.println("Initial Balance: $" + initialBalance);
	}

}
