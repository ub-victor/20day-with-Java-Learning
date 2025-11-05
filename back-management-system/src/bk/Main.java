package bk;

public class Main {

	public static void main(String[] args) {

		OpenAccount account = new OpenAccount();
		
		account.accountNumber = 123456;
		account.accountHolderName = "John Doe";
		account.address = "123 Main St, Anytown, USA";
		account.phoneNumber = "555-1234";
		account.email = "victoireushindi371@gmail.com";
		account.initialBalance = "1000.00";
		account.DisplayAccountDetails();

	}

}
