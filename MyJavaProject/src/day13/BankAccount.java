package day13;

public class BankAccount {
	
	// Static variable to keep track of total account created
	static int totalAccounts = 0;
	
	static int generateAccountNumber() {
		
		totalAccounts++;
		
		return 1000 + totalAccounts;
	}
	
	private int accountNum;
	private String accholderName;
	private double balance;
	
	public BankAccount(String accholderName, double initialBalance ) {
		this.accountNum = generateAccountNumber();
		this.accholderName = accholderName;
		balance = initialBalance;
	}
	
    public static	int getTotalAccount() {
		return totalAccounts;
	}
	
	void displayAccountDetails() {
		
		System.out.println("Account Number: "+ accountNum);
		System.out.println("Account Holder: "+ accholderName);
		System.out.println("Balance : $"+ balance);
		
	}

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount("John Doe", 500.00);
		BankAccount account2 = new BankAccount("Jane Doe", 500.00);
		BankAccount account3 = new BankAccount("James Doe", 500.00);
		
		account1.displayAccountDetails();
		account2.displayAccountDetails();
		account3.displayAccountDetails();
		
		
		System.out.println("Total account created: "+ getTotalAccounts());
		
		
		

	}

}
