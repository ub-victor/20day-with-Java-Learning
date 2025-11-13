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

class Cat extends Dog1 {
	String color = "White";
	
	void meow() {
		 System.out.println("The cat meows");
	}
}

public class HierachicalInheritanceExample {

	public static void main(String[] args) {
		Dog1 dog = new Dog1();
		Cat cat = new Cat();
		
		System.out.println(dog.type);
		System.out.println(dog.breed);
		dog.eat();
		dog.bark();
		
		System.out.println(cat.type);
		System.out.println(cat.color);
		System.out.println(cat);
		 
	}

}
