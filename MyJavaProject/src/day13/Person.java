package day13;

public class Person {
	
	private String name;
	private int age;
	
	void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void displayPersonDetails() {
		System.out.println("Person details : "+ name + " is " + age + " years old");
	}

}
