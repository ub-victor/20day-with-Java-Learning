package stocksystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StockManager {
    // === Static Variables ===
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> productIDs = new ArrayList<>();
    static ArrayList<String> productNames = new ArrayList<>();
    static ArrayList<Double> productPrices = new ArrayList<>();
    static ArrayList<Integer> productQuantities = new ArrayList<>();
    static ArrayList<String> history = new ArrayList<>();

    static double totalSales = 0.0;
    static final int LOW_STOCK_THRESHOLD = 5;

    // === 1. Add Product ===
    public static void addProduct() {
        System.out.println("\n========== ADD NEW PRODUCT ==========");

        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price per Unit: ");
        double price = sc.nextDouble();
        while (price <= 0) {
            System.out.print("Invalid price! Enter again (>0): ");
            price = sc.nextDouble();
        }

        System.out.print("Enter Initial Quantity: ");
        int qty = sc.nextInt();
        while (qty <= 0) {
            System.out.print("Quantity cannot be 0! Enter again (>0): ");
            qty = sc.nextInt();
        }

        productIDs.add(id);
        productNames.add(name);
        productPrices.add(price);
        productQuantities.add(qty);
        history.add("Added product: " + name + " (ID: " + id + "), Qty: " + qty);

        System.out.println("Product added successfully!");
        sc.nextLine(); // clear buffer
    }

    // === 2. View Product (only if quantity > 10) ===
    public static void viewProduct() {
        System.out.println("\n========== VIEW PRODUCTS (Qty > 10) ==========");
        boolean found = false;

        for (int i = 0; i < productIDs.size(); i++) {
            if (productQuantities.get(i) > 10) {
                found = true;
                System.out.println("ID: " + productIDs.get(i) +
                        " | Name: " + productNames.get(i) +
                        " | Price: " + productPrices.get(i) +
                        " | Quantity: " + productQuantities.get(i));
            }
        }

        if (!found) {
            System.out.println("No products with quantity above 10.");
        }
    }

    // === 3. Update Stock ===
    public static void updateStock() {
        System.out.println("\n========== UPDATE STOCK ==========");
        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        int index = productIDs.indexOf(id);
        if (index == -1) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter additional quantity to add (minimum 5): ");
        int addQty = sc.nextInt();
        if (addQty < 5) {
            System.out.println("Quantity must be at least 5.");
        } else {
            productQuantities.set(index, productQuantities.get(index) + addQty);
            history.add("Updated stock for " + productNames.get(index) + " (+" + addQty + ")");
            System.out.println("Stock updated successfully!");
        }
        sc.nextLine();
    }

    // === 4. Sell Product ===
    public static void sellProduct() {
        System.out.println("\n========== SELL PRODUCT ==========");
        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        int index = productIDs.indexOf(id);
        if (index == -1) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Enter quantity to sell (minimum 10): ");
        int sellQty = sc.nextInt();
        if (sellQty < 10) {
            System.out.println(" Quantity must be at least 10.");
        } else if (sellQty > productQuantities.get(index)) {
            System.out.println(" Insufficient stock available!");
        } else {
            double saleAmount = sellQty * productPrices.get(index);
            totalSales += saleAmount;
            productQuantities.set(index, productQuantities.get(index) - sellQty);
            history.add("Sold " + sellQty + " of " + productNames.get(index) +
                    " | Sale: " + saleAmount);
            System.out.println("Sale completed! Amount: " + saleAmount);
        }
        sc.nextLine();
    }

    // === 5. Check Stock Level ===
    public static void checkStockLevel() {
        System.out.println("\n========== CHECK STOCK LEVEL ==========");
        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        int index = productIDs.indexOf(id);
        if (index == -1) {
            System.out.println("Product not found!");
            return;
        }

        int qty = productQuantities.get(index);
        System.out.println("Current stock for " + productNames.get(index) + ": " + qty);
        if (qty < LOW_STOCK_THRESHOLD) {
            System.out.println("WARNING: Low stock level!");
        }
    }

    // === 6. Calculate Stock Value ===
    public static void calculateStockValue() {
        double totalValue = 0;
        for (int i = 0; i < productIDs.size(); i++) {
            totalValue += productQuantities.get(i) * productPrices.get(i);
        }

        System.out.println("\nTotal Stock Value: " + totalValue);
    }

    // === 7. Apply Discount ===
    public static void applyDiscount() {
        System.out.println("\n========== APPLY DISCOUNT ==========");
        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        int index = productIDs.indexOf(id);
        if (index == -1) {
            System.out.println("Product not found!");
            return;
        }

        int qty = productQuantities.get(index);
        if (qty >= 10 && qty <= 20) {
            System.out.print("Enter discount percentage: ");
            double discount = sc.nextDouble();
            double discountAmount = productPrices.get(index) * discount / 100;
            productPrices.set(index, productPrices.get(index) - discountAmount);
            history.add("Discount of " + discount + "% applied to " + productNames.get(index));
            System.out.println("Discount applied! New price: " + productPrices.get(index));
        } else {
            System.out.println("Discount applicable only for quantities between 10 and 20.");
        }
        sc.nextLine();
    }

    // === 8. Remove Product ===
    public static void removeProduct() {
        System.out.println("\n========== REMOVE PRODUCT ==========");
        System.out.print("Enter Product ID to remove: ");
        String id = sc.nextLine();

        int index = productIDs.indexOf(id);
        if (index == -1) {
            System.out.println("Product not found!");
            return;
        }

        System.out.print("Are you sure you want to remove this product? (yes/no): ");
        String confirm = sc.nextLine();

        if (confirm.equalsIgnoreCase("yes")) {
            history.add("Removed product: " + productNames.get(index));
            productIDs.remove(index);
            productNames.remove(index);
            productPrices.remove(index);
            productQuantities.remove(index);
            System.out.println("Product removed successfully!");
        } else {
            System.out.println("Operation cancelled.");
        }
    }

    // === 9. Stock History ===
    public static void stockHistory() {
        System.out.println("\n========== STOCK HISTORY ==========");
        if (history.isEmpty()) {
            System.out.println("No stock operations recorded yet.");
        } else {
            for (String entry : history) {
                System.out.println("- " + entry);
            }
        }
    }

    // === 10. Generate Report ===
    public static void generateReport() {
        System.out.println("\n========== STOCK SUMMARY REPORT ==========");
        System.out.println("Total Products: " + productIDs.size());

        double totalStockValue = 0;
        int lowStockCount = 0;
        for (int i = 0; i < productIDs.size(); i++) {
            totalStockValue += productQuantities.get(i) * productPrices.get(i);
            if (productQuantities.get(i) < LOW_STOCK_THRESHOLD) lowStockCount++;
        }

        System.out.println("Total Stock Value: " + totalStockValue);
        System.out.println("Total Sales Made: " + totalSales);
        System.out.println("Products Below Threshold: " + lowStockCount);
        System.out.println("==========================================");
    }

    // === MAIN METHOD ===
    public static void main(String[] args) {
        int option;

        System.out.println("=========================================");
        System.out.println("📦 WELCOME TO STOCK MANAGEMENT SYSTEM 📦");
        System.out.println("=========================================");

        do {
            System.out.println("\n--------- MAIN MENU ---------");
            System.out.println("1. Add Product");
            System.out.println("2. View Products");
            System.out.println("3. Update Stock");
            System.out.println("4. Sell Product");
            System.out.println("5. Check Stock Level");
            System.out.println("6. Calculate Stock Value");
            System.out.println("7. Apply Discount");
            System.out.println("8. Remove Product");
            System.out.println("9. View Stock History");
            System.out.println("10. Generate Report");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");
            option = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (option) {
                case 1 -> addProduct();
                case 2 -> viewProduct();
                case 3 -> updateStock();
                case 4 -> sellProduct();
                case 5 -> checkStockLevel();
                case 6 -> calculateStockValue();
                case 7 -> applyDiscount();
                case 8 -> removeProduct();
                case 9 -> stockHistory();
                case 10 -> generateReport();
                case 0 -> System.out.println("👋 Exiting system. Goodbye!");
                default -> System.out.println("❌ Invalid option! Try again.");
            }

        } while (option != 0);
    }
}


🧠 Why Use static final Here?

✅ static → accessible by all static methods (no need to pass it around).
✅ final → prevents accidental modification during execution.
✅ Clean code → you can change the threshold easily in one place if needed later.

🏁 In summary:
Code	Description
static	Class-wide variable (shared by all methods).
final	Cannot be changed after initialization (constant).
int	Integer type.
LOW_STOCK_THRESHOLD = 5	Defines a constant warning limit of 5 units for low stock.