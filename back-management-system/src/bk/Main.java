package bk;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		OpenAccount account = new OpenAccount();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Account Number: ");
		account.setAccountNumber(sc.nextInt());
		sc.nextLine(); // Consume newline

		System.out.print("Enter Account Holder Name: ");
		account.setAccountHolderName(sc.nextLine());

		System.out.print("Enter Address: ");
		account.setAddress(sc.nextLine());

		System.out.print("Enter Phone Number: ");
		account.setPhoneNumber(sc.nextLine());

		System.out.print("Enter Email: ");
		account.setEmail(sc.nextLine());

		System.out.print("Enter Initial Balance: ");
		account.setInitialBalance(sc.nextDouble());

		account.DisplayAccountDetails();

	}

}
