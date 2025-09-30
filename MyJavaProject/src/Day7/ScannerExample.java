package Day7;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter an integer: ");
		int a = sc.nextInt(); // We used nextInt to read the int input 
		System.out.println("Provided value of a: " + a);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		
		// for decimal
		System.out.println("Enter an decimal: ");
		double num = sc.nextDouble();
		System.out.println("Provided value of b: "+ num);
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		 
		// for String
		System.out.println("Enter your name: ");
		String st = sc.next();
		System.out.println("your name is: "+ st);

	}

}
