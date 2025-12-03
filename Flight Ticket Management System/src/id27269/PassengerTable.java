package id27269;

import java.util.ArrayList;
import java.util.List;

public class PassengerTable {
    private List<Passenger> passengers = new ArrayList<>();

    public void addPassenger(Passenger p) {
        passengers.add(p);
    }

    public Passenger findByPassport(String passport) {
        return passengers.stream()
                .filter(p -> p.getPassportNumber().equalsIgnoreCase(passport))
                .findFirst().orElse(null);
    }

    public List<Passenger> getAll() { return passengers; }
}
