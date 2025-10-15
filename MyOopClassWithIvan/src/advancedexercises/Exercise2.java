package advancedexercises;
import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a year");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0) {
			System.out.println(year + " Is a leap year.");
		}else {
			System.out.println(year + " Is Not a leap year.");
		}
		
		sc.close();		

	}

}
