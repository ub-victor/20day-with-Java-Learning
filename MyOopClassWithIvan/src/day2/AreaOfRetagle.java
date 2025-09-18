package day2;
import java.util.Scanner;

public class AreaOfRetagle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length (l): ");
		double l = sc.nextDouble();
		
		System.out.println("Enter width (w): ");
		double w = sc.nextDouble();
		
		double area = l* w;
		System.out.println("Area = " + area);
		sc.close();

	}

}
