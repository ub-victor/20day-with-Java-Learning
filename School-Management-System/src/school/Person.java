package school;

// Base Class : Person
// Person will hold common attributes: name, age, address, ect.

/*
Base class representing a person in the school system.
Contains common attributes line name, age, and address
*/

public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Getters and Setters (encapsulation)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Display method - will be overridden by subclasses

    public void displayInfo(){
        System.out.println("Name: "+ name);
        System.out.println("Name: "+ age);
        System.out.println("Name: "+ address);
    }

    
}
