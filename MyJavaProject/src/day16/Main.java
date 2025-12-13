package day16;

abstract class Animal {
	abstract void makeSound(); // abstract method
	
	void sleep() { // normal method
		System.out.println("Animal is sleeping...");
	}
}

class Dog extends Animal{

	@Override
	void makeSound() {
		System.out.println("Dog says woof Woof");
		
	}
	
}

class Cat extends Animal{

	@Override
	void makeSound() {
		System.out.println("Cat says Meow Meow");
		
	}
	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
