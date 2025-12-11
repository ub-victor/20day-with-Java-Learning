package day15;

class Vehical {
	
	void display() {
		System.out.println("This is a vehicle");
	}
}

class Car extends Vehical{
	
}

public class FinalClass {

	public static void main(String[] args) {
		Car myVehical = new Car();
		myVehical.display();

	}

}
