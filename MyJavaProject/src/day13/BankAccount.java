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
	
	int getTotalAccount() {
		return totalAccounts;
	}

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount("John Doe", 500.00);
		
		
		

	}

}
