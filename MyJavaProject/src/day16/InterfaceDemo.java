package day16;

interface Shape{
	int length = 10;
	int width = 20;
	double PI = 3.14159;
	
	void circle();
	
	default void square() {
		System.out.println("This is a Square -- default method");
	}
	
	static void rectangle() {
		System.out.println("This is a Rectangle -- static method");
	}
}

public class InterfaceDemo implements Shape {

	public static void main(String[] args) {
		InterfaceDemo idObj = new InterfaceDemo();
		idObj.circle(); // abstract
		idObj.square();// default
		//idObj.rectangle(); // cannot access we can do this to access it !.
		Shape.rectangle(); // Static methods can be access by using the interface name
	}

	@Override
	public void circle() {
		System.out.println("This is a Circle -- Abstract method");
	}

}
