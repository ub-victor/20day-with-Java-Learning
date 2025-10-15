package advancedexercises;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a character: ");
		char ch = sc.next().charAt(0);
		
		if ("AEIOUaeiou".indexOf(ch) != -1) {
			System.out.println(ch + "Is a vowel.");
		}
		
		
		
		

	}

}