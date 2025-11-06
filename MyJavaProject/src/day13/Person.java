package day13;

public class Person {
	
	private String name;
	private int age;
	
//	void setData(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	// So as the variable are private how to set they data?
	// We can set them using  methods for each class
	
	void setName(String name) {
		this.name = name;
	}
	
	// the get the name then we do this
	
	String getName() {
		return name;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	int getAge() {
		return age; 
	}
	

	
	void displayPersonDetails() {
		System.out.println("Person details : "+ name + " is " + age + " years old");
	}

}
