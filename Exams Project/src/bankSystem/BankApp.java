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
    
    // === 2. Deposit ===
    public static void deposit() {
        if (!accountActive) {
            System.out.println("❌ Please create an account first.");
            return;
        }

        System.out.print("\nEnter deposit amount: ");
        double amount = sc.nextDouble();
        if (amount <= 0) {
            System.out.println("❌ Invalid amount!");
            return;
        }

        balance += amount;
        transactions.add("Deposited: " + amount);
        System.out.println("✅ Successfully deposited " + amount + ". New balance: " + balance);
    }
    
    // === 4. Check Balance ===
    public static void checkBalance() {
        if (!accountActive) {
            System.out.println("❌ Please create an account first.");
            return;
        }

        System.out.println("\n💰 Current Balance: " + balance);
    }
    
    // === 5. Transfer Funds ===
    public static void transferFunds() {
        if (!accountActive) {
            System.out.println("❌ Please create an account first.");
            return;
        }

        System.out.print("\nEnter recipient account number: ");
        sc.nextLine(); // clear buffer
        String recipient = sc.nextLine();

        System.out.print("Enter transfer amount: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("❌ Invalid amount!");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient funds!");
        } else {
            balance -= amount;
            transactions.add("Transferred " + amount + " to Account: " + recipient);
            System.out.println("✅ Successfully transferred " + amount + " to Account " + recipient);
        }
    }
    
    // === 6. Calculate Interest ===
    public static void calculateInterest() {
        if (!accountActive) {
            System.out.println("❌ Please create an account first.");
            return;
        }

        double rate = 5.0; // 5% annual interest
        double interest = balance * rate / 100;
        balance += interest;
        transactions.add("Interest added: " + interest);
        System.out.println("\n✅ Interest of " + interest + " added at " + rate + "% rate.");
        System.out.println("💰 New Balance: " + balance);
    }

    
    


}
