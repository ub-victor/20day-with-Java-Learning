package day16;

interface Shape{
	int length = 10;
	int width = 20;
	double PI = 3.14159;
	
	void circle();
	
	default void square() {
		System.out.println("This is a Square -- default method");
	}
	
	default void rectangle() {
		System.out.println("This is a Rectangle -- default method");
	}
}

public class InterfaceDemo implements Shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void circle() {
		System.out.println("This is a Circle -- Abstract method");
	}

}
