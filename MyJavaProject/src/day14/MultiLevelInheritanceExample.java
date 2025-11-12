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

// Further derived Class

class Puppy extends Dog{
	int age = 1;
	
	void play() {
		System.out.println("The Puppy plays");
	}
}

public class MultiLevelInheritanceExample {

	public static void main(String[] args) {
		
		Puppy puppy = new Puppy();
		
		System.out.println(puppy.type); // Inherited from Animal
		System.out.println(puppy.breed); // Inherited  from Dog
		System.out.println(puppy.age); // Defined in Puppy
		
		puppy.eat(); // from Animal
		puppy.bark(); // From dog
		puppy.play(); // from itself

	}

}
