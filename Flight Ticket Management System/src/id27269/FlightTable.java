package id27269;

import java.util.ArrayList;
import java.util.List;

public class FlightTable {
    private List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight f) { flights.add(f); }

    public Flight findByFlightNumber(String fn) {
        return flights.stream()
                .filter(f -> f.getFlightNumber().equalsIgnoreCase(fn))
                .findFirst().orElse(null);
    }

    public List<Flight> getAll() { return flights; }
}
