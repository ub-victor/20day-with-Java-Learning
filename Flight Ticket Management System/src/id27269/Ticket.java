package id27269;

public abstract class Ticket implements Payable {
    private static int counter = 1000;
    private String ticketId;
    private String passengerName;
    private String flightNumber;
    private double amount;

    public Ticket(String passengerName, String flightNumber, double amount) {
        this.ticketId = generateId();
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive.");
        this.amount = amount;
    }

    private synchronized String generateId() {
        return "T" + (counter++);
    }

    public String getTicketId() { return ticketId; }
    public String getPassengerName() { return passengerName; }
    public String getFlightNumber() { return flightNumber; }
    public double getAmount() { return amount; }

    // validatePaymentDetails and processPayment to be implemented by subclasses
}
