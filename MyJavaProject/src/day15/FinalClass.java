package day15;

final class Vehical {
	
	void display() {
		System.out.println("This is a vehicle");
	}
}

class Car extends Vehical{ // it can not be extended
	
}

public class FinalClass {

	public static void main(String[] args) {
		Car myVehical = new Car();
		myVehical.display();

	}

}
