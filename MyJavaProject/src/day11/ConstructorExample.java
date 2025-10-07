package day11;

public class ConstructorExample {
	
	int x,y;
	
	ConstructorExample(){ // know as Default constructor it takes no parms
		x = 100;
		y=200;
	}
	
	int sum(){
		return (x+y);
	}

	public static void main(String[] args) {
		
		/*
		
		ConstructorExample ce = new ConstructorExample();
		
		System.out.println("Sum of the numbers is: "+ ce.sum());
		*/
		

	}

}
