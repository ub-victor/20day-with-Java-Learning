package day3;

public class SwapNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 25;
		//Method 1: Using a temporary variable 
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swap (with temp): a = "+a +", b= "+b );

	}

}
