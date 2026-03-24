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
}
