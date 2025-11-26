package day15;
// Here is what known as Overriding what the child class declare the same method already implemented in the upper class
class Bank {
	double roi(){
		return 0.5;
	}
}

class JPMC extends Bank{
	double roi() {
		return 9.81;
	}
}

public class OverringDemo {

	public static void main(String[] args) {
		

	}

}
