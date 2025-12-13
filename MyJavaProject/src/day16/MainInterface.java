package day16;

interface Vehicle {
	void start();
	void stop();
}

class Car implements Vehicle{

	@Override
	public void start() {
		 System.out.println("Car is starting...");
		
	}

	@Override
	public void stop() {
		System.out.println("Car has stopped.");
		
	}
	
}

class Bike implements Vehicle {

	@Override
	public void start() {
		 System.out.println("Bike is starting...");
		
	}

	@Override
	public void stop() {
		System.out.println("Bike has stopped.");
		
	}
	
}

public class MainInterface {

	public static void main(String[] args) {
		Vehicle car = new Car();
		car.start();
		car.stop();
		
		Vehicle bike = new Bike();
		bike.start();
		bike.stop();
	}

}
