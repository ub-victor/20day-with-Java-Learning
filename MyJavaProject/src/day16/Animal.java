package day16;

abstract class Animal {
	abstract void makeSound(); // abstract method
	
	void sleep() {
		System.out.println("Animal is sleeping");
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
			System.out.println("Cat says meow meow");
			
		}
		
	}

	public static void main(String[] args) {
		
		Animal dog = new Dog();

	}

}
