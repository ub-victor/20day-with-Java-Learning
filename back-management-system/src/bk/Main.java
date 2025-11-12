package bk;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int idBack = 0;
		String bankName = null;


		// Default values of integer type is 0 and for String type is null
		Deposite deposite = new Deposite(idBack, bankName, null, 0, null, null, 0, null, null, 0.0, 0, 0.0, 0.0);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Bank ID: ");
		idBack = scanner.nextInt();

		scanner.nextLine(); // Consume newline
		
		System.out.println("Enter Bank Name: ");
		bankName = scanner.next();

	}

}
