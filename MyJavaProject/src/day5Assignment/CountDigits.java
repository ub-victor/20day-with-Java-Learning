package day5Assignment;

public class CountDigits {

	public static void main(String[] args) {
		/*
		 Problem:

		Input: 423424
		Output: 6
		 * */
		
		int num = 423424;
		int count = 0;
		
		while(num != 0) {
			num = num/10; // remove last digit
			count++;
		}
		System.out.println("Number of digits: "+ count);

	}

}
