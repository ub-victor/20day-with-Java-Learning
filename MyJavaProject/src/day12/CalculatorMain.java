package day12;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		
		//These is the method modeling
		
		c.add(); 
		c.add(10, 10);
		c.add(10.10, 10.10);
		c.add(10, 10.11);
		c.add(10.11, 10);
		c.add(10.11, 10, 10);
		

	}

}
