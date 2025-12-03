package id27269;

public abstract class Person {
    private String name;
    private String email;
    private String phone;

    public Person(String name, String email, String phone) {
        setName(name);
        setEmail(email);
        setPhone(phone);
    }

    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name cannot be empty.");
        this.name = name.trim();
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("Invalid email.");
        this.email = email.trim();
    }

    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}")) throw new IllegalArgumentException("Phone must be exactly 10 digits.");
        this.phone = phone;
    }

    public abstract void showInfo();
}
