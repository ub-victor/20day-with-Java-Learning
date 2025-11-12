package bk;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int bankId = 0;
		String bankName = null;
		int nationalId = 0;
		String firstName = null;
		String lastName = null;
		int age = 0;
		String address = null;
		String phoneNumber = null;
		double initialBalance = 0.0;



		
		Deposite deposite = new Deposite(idBack, bankName, null, 0, null, null, 0, null, null, 0.0, 0, 0.0, 0.0);
		Scanner scanner = new Scanner(System.in);


		System.out.println("Enter Bank ID: ");
		idBack = scanner.nextInt();

		scanner.nextLine(); 

		System.out.println("Enter Bank Name: ");
		bankName = scanner.next();

		System.out.println("Enter National ID: ");
		nationalId = scanner.nextInt();

		scanner.nextLine(); 

		System.out.println("Enter First Name: ");
		firstName = scanner.nextLine();

		System.out.println("Enter Last Name: ");
		lastName = scanner.nextLine();

		System.out.println("Enter Age: ");
		age = scanner.nextInt();

		scanner.nextLine(); 

		System.out.println("Enter Address: ");
		address = scanner.nextLine();

		System.out.println("Enter Phone Number: ");
		phoneNumber = scanner.nextLine();

		System.out.println("Enter Initial Balance: ");
		initialBalance = scanner.nextDouble();

	}

}
