package day12;

public class Callbyvalue {

	public static void main(String[] args) {
		TestMethod tm = new TestMethod();
		
		int num = 100;
		System.out.println("Value before the method call: " + num);
		
		tm.modifyValue(num);
		
		System.out.println("Value after the method call: "+ num);
		
		

	}

}
