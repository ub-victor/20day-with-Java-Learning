package day5Assignment;

public class ReverseNumber {

	public static void main(String[] args) {
		/*
		Input: 1234
		Output: 4321

		We use % (modulus) to get the last digit and / (division) to remove the last digit.
		 
		 */
		int num = 1234;
		int reversed = 0;
		
		while(num !=0) {
			int digit = num % 10; // get last digit
			reversed = reversed * 10 + digit; // add digit to reversed
			num = num / 10; // remove last digit 
		}
		
		System.out.println("Reversed Number: "+ reversed);

	}

}
