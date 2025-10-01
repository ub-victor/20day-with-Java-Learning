package exercises;

public class Exercise49 {
    public static void main(String[] args) {
        double price = 9.99;
        int quantity = 5;

        double total = price * quantity;
        double discounted = total - (total * 0.20);

        System.out.println("Original total: " + total);
        System.out.println("Price after 20% discount: " + discounted);
    }
}
