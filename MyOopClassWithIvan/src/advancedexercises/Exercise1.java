package advancedexercises;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter side1: ");
		int a = sc.nextInt();
		System.out.println("Enter side2: ");
		int b = sc.nextInt();
		System.out.println("Enter side3: ");
		int c = sc.nextInt();
		
		if (a+b > c && a + c > b && b+c> a) {
			System.out.println("These sides form a triangle");
		}else {
			System.out.println("These sides do Not form a triangle");
		}
		
		sc.close();

	}

}
