package bk;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		OpenAccount account = new OpenAccount();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Account Number: ");
		account.accountNumber(sc.nextInt());
		sc.nextLine(); // Consume newline

		System.out.print("Enter Account Holder Name: ");
		account.accountHolderName(sc.nextLine());

		System.out.print("Enter Address: ");
		account.address(sc.nextLine());

		System.out.print("Enter Phone Number: ");
		account.phoneNumber(sc.nextLine());

		System.out.print("Enter Email: ");
		account.email(sc.nextLine());

		System.out.print("Enter Initial Balance: ");
		account.initialBalance(sc.nextDouble());

		account.DisplayAccountDetails();


		Loan loan = new Loan();
		loan.setLoanId(1001);
		System.out.println("Loan ID: " + loan.getLoanId()); 

	}
 
}
