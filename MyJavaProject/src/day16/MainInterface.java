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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
