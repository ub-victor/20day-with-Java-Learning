package day13;

public class BankAccount {
	
	// Static variable to keep track of total account created
	static int totalAccounts = 0;
	
	static int generateAccountNumber() {
		
		totalAccounts++;
		
		return 1000 + totalAccounts;
	}
	
	

	public static void main(String[] args) {
		

	}

}
