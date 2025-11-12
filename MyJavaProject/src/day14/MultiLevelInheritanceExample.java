package day14;

// Base/Parent class

class Animal{
	String type = "General Animal";
	
	void eat() {
		
		System.out.println("This animal eats food");
		
	}
}

class Dog extends Animal {
	String breed = "Labrador";
	
	void bark() {
		System.out.println("The dog barks");
	}
} 

public class MultiLevelInheritanceExample {

	public static void main(String[] args) {
		

	}

}
