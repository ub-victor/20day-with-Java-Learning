package day5Assignment;

public class PalindromeCheck {

	public static void main(String[] args) {
		int num = 121;
		int original = num;
		int reversed = 0;
		
		while (num != 0) {
			int digit = num % 10;
			reversed = reversed * 10 + digit;
			num = num/10;
		}
		
		if(original == reversed) {
			System.out.println(original + " is Palindrone");
		}else {
			System.out.println(original + " is Not palindrome");
		}

	}

}
