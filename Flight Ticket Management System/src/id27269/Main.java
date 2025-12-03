package id27269;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static PassengerTable passengerTable = new PassengerTable();
    private static FlightTable flightTable = new FlightTable();
    private static TicketTable ticketTable = new TicketTable();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        seedSampleFlights();
        System.out.println("=== CERENA Airways Ticket Management System ===");
        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1": registerPassenger(); break;
                case "2": createFlight(); break;
                case "3": listFlights(); break;
                case "4": bookFlight(); break;
                case "5": listPassengers(); break;
                case "6": listTickets(); break;
                case "0": running = false; break;
                default: System.out.println("Invalid option.");
            }
        }
        System.out.println("Goodbye!");
    }

    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Register Passenger");
        System.out.println("2. Create Flight");
        System.out.println("3. List Flights");
        System.out.println("4. Book Flight");
        System.out.println("5. List Passengers");
        System.out.println("6. List Tickets");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    private static void registerPassenger() {
        try {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Phone (10 digits): ");
            String phone = scanner.nextLine();
            System.out.print("Passport number: ");
            String passport = scanner.nextLine();
            Passenger p = new Passenger(name, email, phone, passport);
            passengerTable.addPassenger(p);
            System.out.println("Passenger registered: " + p);
        } catch (IllegalArgumentException ex) {
            System.out.println("Registration failed: " + ex.getMessage());
        }
    }

    private static void createFlight() {
        try {
            System.out.print("Flight number: ");
            String fn = scanner.nextLine();
            System.out.print("Destination: ");
            String dest = scanner.nextLine();
            System.out.print("Available seats (int): ");
            int seats = Integer.parseInt(scanner.nextLine());
            System.out.print("Ticket price (double): ");
            double price = Double.parseDouble(scanner.nextLine());
            Flight f = new Flight(fn, dest, seats, price);
            flightTable.addFlight(f);
            System.out.println("Flight created: " + f);
        } catch (Exception ex) {
            System.out.println("Failed to create flight: " + ex.getMessage());
        }
    }

    private static void listFlights() {
        List<Flight> flights = flightTable.getAll();
        if (flights.isEmpty()) {
            System.out.println("No flights available.");
            return;
        }
        System.out.println("Flights:");
        flights.forEach(f -> System.out.println(f));
    }

    private static void listPassengers() {
        List<Passenger> ps = passengerTable.getAll();
        if (ps.isEmpty()) {
            System.out.println("No passengers registered.");
            return;
        }
        System.out.println("Passengers:");
        ps.forEach(System.out::println);
    }

    private static void listTickets() {
        List<Ticket> ts = ticketTable.getAll();
        if (ts.isEmpty()) {
            System.out.println("No tickets issued.");
            return;
        }
        System.out.println("Tickets:");
        for (Ticket t : ts) {
            System.out.println("TicketID: " + t.getTicketId() + " | Passenger: " + t.getPassengerName() +
                    " | Flight: " + t.getFlightNumber() + " | Amount: " + t.getAmount());
        }
    }

    private static void bookFlight() {
        try {
            System.out.print("Enter passenger passport number: ");
            String passport = scanner.nextLine();
            Passenger p = passengerTable.findByPassport(passport);
            if (p == null) {
                System.out.println("Passenger not found. Please register first.");
                return;
            }
            System.out.print("Enter flight number: ");
            String fn = scanner.nextLine();
            Flight f = flightTable.findByFlightNumber(fn);
            if (f == null) {
                System.out.println("Flight not found.");
                return;
            }
            System.out.print("How many seats to book? ");
            int seats = Integer.parseInt(scanner.nextLine());
            if (!f.checkAvailability(seats)) {
                System.out.println("Not enough seats available.");
                return;
            }
            double total = seats * f.getTicketPrice();
            System.out.printf("Total amount: %.2f%n", total);
            System.out.println("Choose payment method: 1) Credit Card  2) Mobile");
            String pm = scanner.nextLine().trim();
            Ticket ticket = null;
            if ("1".equals(pm)) {
                System.out.print("Card number (digits): ");
                String cardNumber = scanner.nextLine();
                System.out.print("Card holder name: ");
                String holder = scanner.nextLine();
                System.out.print("Expiry (MM/YY): ");
                String expiry = scanner.nextLine();
                System.out.print("CVV (3 digits): ");
                String cvv = scanner.nextLine();
                ticket = new CreditCardPayment(p.getName(), f.getFlightNumber(), total, cardNumber, holder, expiry, cvv);
            } else if ("2".equals(pm)) {
                System.out.print("Mobile number (10 digits): ");
                String mobile = scanner.nextLine();
                System.out.print("Provider (e.g., M-Pesa): ");
                String provider = scanner.nextLine();
                ticket = new MobilePayment(p.getName(), f.getFlightNumber(), total, mobile, provider);
            } else {
                System.out.println("Invalid payment option.");
                return;
            }

            // Process payment via Payable interface (polymorphism)
            Payable payment = ticket;
            if (!payment.validatePaymentDetails()) {
                System.out.println("Payment validation failed. Booking aborted.");
                return;
            }

            if (payment.processPayment()) {
                // reduce seats only when payment succeeds
                boolean booked = f.bookSeat(seats);
                if (booked) {
                    ticketTable.addTicket(ticket);
                    System.out.println("Booking confirmed. Ticket ID: " + ticket.getTicketId());
                } else {
                    System.out.println("Failed to reserve seats after payment (unexpected).");
                }
            } else {
                System.out.println("Payment processing failed.");
            }

        } catch (NumberFormatException ex) {
            System.out.println("Invalid number input.");
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Booking failed: " + ex.getMessage());
        }
    }

    private static void seedSampleFlights() {
        try {
            flightTable.addFlight(new Flight("CR101", "Kigali", 50, 120.0));
            flightTable.addFlight(new Flight("CR102", "Nairobi", 30, 200.0));
        } catch (Exception ignored) {}
    }
}
