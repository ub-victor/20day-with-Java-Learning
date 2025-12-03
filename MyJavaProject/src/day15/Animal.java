package day15;


public class Animal {
	String color = "brown";
	public Animal() {
		System.out.println("Animal default constructor");
	}
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
		 super();//Default cons optional
		System.out.println("Dog Defalt Constructor Called");
	}
}
