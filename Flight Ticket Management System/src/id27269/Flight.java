package id27269;

public class Flight implements Bookable {
    private String flightNumber;
    private String destination;
    private int availableSeats;
    private double ticketPrice;

    public Flight(String flightNumber, String destination, int availableSeats, double ticketPrice) {
        setFlightNumber(flightNumber);
        setDestination(destination);
        setAvailableSeats(availableSeats);
        setTicketPrice(ticketPrice);
    }

    public String getFlightNumber() { return flightNumber; }
    public String getDestination() { return destination; }
    public int getAvailableSeats() { return availableSeats; }
    public double getTicketPrice() { return ticketPrice; }

    public void setFlightNumber(String flightNumber) {
        if (flightNumber == null || flightNumber.trim().isEmpty())
            throw new IllegalArgumentException("Flight number cannot be empty.");
        this.flightNumber = flightNumber.trim();
    }

    public void setDestination(String destination) {
        if (destination == null || destination.trim().isEmpty())
            throw new IllegalArgumentException("Destination cannot be empty.");
        this.destination = destination.trim();
    }

    public void setAvailableSeats(int availableSeats) {
        if (availableSeats < 0) throw new IllegalArgumentException("Available seats cannot be negative.");
        this.availableSeats = availableSeats;
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice <= 0) throw new IllegalArgumentException("Ticket price must be positive.");
        this.ticketPrice = ticketPrice;
    }

    @Override
    public boolean checkAvailability(int seatsRequested) {
        return seatsRequested > 0 && seatsRequested <= availableSeats;
    }

    @Override
    public boolean bookSeat(int seatsRequested) {
        if (!checkAvailability(seatsRequested)) return false;
        availableSeats -= seatsRequested;
        return true;
    }

    @Override
    public String toString() {
        return flightNumber + " -> " + destination + " | Seats: " + availableSeats + " | Price: " + ticketPrice;
    }
}
