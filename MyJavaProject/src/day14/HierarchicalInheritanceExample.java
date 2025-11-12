package day14;

class Animal1{
	String type = "General Animal";
	
	void eat() {
		System.out.println("This animal eats food");
	}
}

class Dog1 extends Animal1 {
	String breed = "Labrador";
	
	void bark() {
		System.out.println("The dog barks");
	}
}

class cat extends Dog1{
	String color = "White";
	
	void meow() {
		System.out.println("The cat meows");
	}
}

public class HierarchicalInheritanceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
