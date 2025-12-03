package id27269;

public class Passenger extends Person {
    private String passportNumber;

    public Passenger(String name, String email, String phone, String passportNumber) {
        super(name, email, phone);
        setPassportNumber(passportNumber);
    }

    public String getPassportNumber() { return passportNumber; }

    public void setPassportNumber(String passportNumber) {
        if (passportNumber == null || passportNumber.trim().isEmpty())
            throw new IllegalArgumentException("Passport number cannot be empty.");
        this.passportNumber = passportNumber.trim();
    }

    @Override
    public void showInfo() {
        System.out.println("Passenger: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("Phone: " + getPhone());
        System.out.println("Passport: " + getPassportNumber());
    }

    @Override
    public String toString() {
        return getName() + " (Passport: " + passportNumber + ")";
    }
}
