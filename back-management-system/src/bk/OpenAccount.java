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

	public OpenAccount(int accountNumber, String accountHolderName, String address, String phoneNumber, String email,
			double initialBalance) {
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.initialBalance = initialBalance;
	}

	public OpenAccount() {
	} 

	// Add simple setters so Main.java can call methods like account.accountNumber(...)
	public void accountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void accountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void address(String address) {
		this.address = address;
	}

	public void phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void email(String email) {
		this.email = email;
	}

	public void initialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}

}
