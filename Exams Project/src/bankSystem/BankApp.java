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

    // === 7. Display Account Info ===
    public static void displayAccountInfo() {
        if (!accountActive) {
            System.out.println("❌ Please create an account first.");
            return;
        }

        System.out.println("\n========== ACCOUNT INFORMATION ==========");
        System.out.println("👤 Account Holder: " + accountHolderName);
        System.out.println("🏦 Account Number: " + accountNumber);
        System.out.println("💰 Current Balance: " + balance);
        System.out.println("==========================================");
    }
    
 // === 8. Apply Monthly Fee ===
    public static void applyFee() {
        if (!accountActive) {
            System.out.println("❌ Please create an account first.");
            return;
        }

        double fee = 500;
        if (balance >= fee) {
            balance -= fee;
            transactions.add("Monthly fee applied: -" + fee);
            System.out.println("💸 A service fee of " + fee + " has been deducted.");
        } else {
            System.out.println("⚠️ Not enough funds to deduct service fee.");
        }
        System.out.println("Updated Balance: " + balance);
    }

    // === 9. Transaction History ===
    public static void transactionHistory() {
        if (!accountActive) {
            System.out.println("❌ Please create an account first.");
            return;
        }

        System.out.println("\n========== TRANSACTION HISTORY ==========");
        if (transactions.isEmpty()) {
            System.out.println("No transactions recorded.");
        } else {
            for (String t : transactions) {
                System.out.println("- " + t);
            }
        }
        System.out.println("=========================================");
    }
    

    // === 10. Close Account ===
    public static void closeAccount() {
        if (!accountActive) {
            System.out.println("❌ No active account found.");
            return;
        }

        System.out.print("\nAre you sure you want to close your account? (yes/no): ");
        sc.nextLine(); // clear input buffer
        String choice = sc.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("\n⚠️ Final Balance: " + balance);
            System.out.println("✅ Account closed successfully. Thank you for banking with us!");
            // Reset data
            accountActive = false;
            balance = 0;
            transactions.clear();
            accountHolderName = "";
            accountNumber = "";
        } else {
            System.out.println("Account remains active.");
        }
    }
    
 // === MAIN METHOD ===
    public static void main(String[] args) {
        int option;

        System.out.println("=========================================");
        System.out.println("🏦 WELCOME TO SIMPLE BANK MANAGEMENT SYSTEM 🏦");
        System.out.println("=========================================");

        do {
            System.out.println("\n--------- MAIN MENU ---------");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transfer Funds");
            System.out.println("6. Calculate Interest");
            System.out.println("7. Display Account Info");
            System.out.println("8. Apply Monthly Fee");
            System.out.println("9. Transaction History");
            System.out.println("10. Close Account");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> createAccount();
                case 2 -> deposit();
                case 3 -> withdraw();
                case 4 -> checkBalance();
                case 5 -> transferFunds();
                case 6 -> calculateInterest();
                case 7 -> displayAccountInfo();
                case 8 -> applyFee();
                case 9 -> transactionHistory();
                case 10 -> closeAccount();
                case 0 -> System.out.println("👋 Thank you for using Simple Bank System!");
                default -> System.out.println("❌ Invalid choice. Please try again.");
            }

        } while (option != 0);
    }
}
