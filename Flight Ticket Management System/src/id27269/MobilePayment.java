package id27269;

public class MobilePayment extends Ticket {
    private String mobileNumber;
    private String provider; // e.g., M-Pesa, AirtelMoney

    public MobilePayment(String passengerName, String flightNumber, double amount, String mobileNumber, String provider) {
        super(passengerName, flightNumber, amount);
        this.mobileNumber = mobileNumber;
        this.provider = provider;
    }

    @Override
    public boolean validatePaymentDetails() {
        if (mobileNumber == null || !mobileNumber.matches("\\d{10}")) return false;
        if (provider == null || provider.trim().isEmpty()) return false;
        return true;
    }

    @Override
    public boolean processPayment() {
        if (!validatePaymentDetails()) return false;
        System.out.println("Processing mobile payment (" + provider + ") for " + getPassengerName());
        printReceipt(getTicketId(), getPassengerName(), getFlightNumber(), getAmount());
        return true;
    }
}
