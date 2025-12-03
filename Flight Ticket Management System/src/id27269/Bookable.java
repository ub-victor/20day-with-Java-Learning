package id27269;

public interface Bookable {
    boolean checkAvailability(int seatsRequested);
    boolean bookSeat(int seatsRequested);
}
