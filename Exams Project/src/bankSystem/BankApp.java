package bankSystem;
import java.util.ArrayList;
import java.util.Scanner;

public class BankApp {
	// === Static Variables ===
    static Scanner sc = new Scanner(System.in);
    static String accountHolderName;
    static String accountNumber;
    static double balance = 0.0;
    static ArrayList<String> transactions = new ArrayList<>();
    static boolean accountActive = false;
	
    //=== 1. Create Account ===
    public static void createAccount() {
        System.out.println("\n========== CREATE ACCOUNT ==========");
        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();

        System.out.print("Enter Initial Deposit Amount: ");
        double initialDeposit = sc.nextDouble();
        while (initialDeposit < 0) {
            System.out.print("Invalid amount! Please enter a non-negative value: ");
            initialDeposit = sc.nextDouble();
        }

        balance = initialDeposit;
        accountActive = true;
        transactions.add("Account created with initial deposit: " + initialDeposit);
        System.out.println("✅ Account successfully created!\n");
    }
    


}
