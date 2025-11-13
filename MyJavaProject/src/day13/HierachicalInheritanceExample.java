package day13;

class Animal1{
	String type = "General Animal";
	
	void eat() {
		System.out.println("This animal eats food");
	}
}

class Dog1 extends Animal1{
	String breed = "Labrador";
	
	void bark() {
		System.out.println("The dog barks");
	}
}

class Cat extends Animal1 {
	String color = "White";
}

public class HierachicalInheritanceExample {

	public static void main(String[] args) {
		 
	}

}
