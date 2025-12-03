package day15;


public class Animal {
	String color = "brown";
	void sound() {
		System.out.println("Animal makes a sound");
	}
	
		
}

class Dog extends Animal{
	String color = "white";
	
	void displayColor() {
		System.out.println(super.color);
		System.out.println(color);
	}
	
	void Sound() {
		super.sound();
		System.out.println("Dog Barks");
	}

	Dog(){
		System.out.println("Dog Defalt Constructor Called");
	}
}
