package id27269;

public interface Payable {
    boolean validatePaymentDetails();
    boolean processPayment();

    default void printReceipt(String ticketId, String passengerName, String flightNumber, double amount) {
        System.out.println("------ RECEIPT ------");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Passenger: " + passengerName);
        System.out.println("Flight: " + flightNumber);
        System.out.printf("Amount Paid: %.2f%n", amount);
        System.out.println("---------------------");
    }
}
