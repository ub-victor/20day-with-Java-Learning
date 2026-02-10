package day17;

/**
 * Demonstrates the difference between public and private access,
 * and how to expose internal state via getters/setters.
 */
public class PersonAccessModifier {

    // Public field: accessible from anywhere
    public String name = "Ushindi Bihame Victoire";

    // Private field: accessible only within this class
    private int age = 21;

    /**
     * Instance method that prints the person's age.
     * Uses the private age field via the class's own methods.
     */
    public void showAge() {
        System.out.println(getAge());
    }

    /**
     * Entry point for the program.
     * Creates an instance and uses its methods to display age.
     */
    public static void main(String[] args) {
        PersonAccessModifier p = new PersonAccessModifier();
        p.showAge();          // prints 21
        System.out.println(p.name); // prints the public name
    }

    /**
     * Getter for the private age field.
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Setter for the private age field.
     * @param age new age value
     */
    public void setAge(int age) {
        this.age = age;
    }
}