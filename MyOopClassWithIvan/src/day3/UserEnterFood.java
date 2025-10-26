package day3;

import java.util.ArrayList;
import java.util.Scanner;

public class UserEnterFood {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> foods = new ArrayList<>();
		
		System.out.print("Enter the # of food you would like: ");
		int numOfFood = sc.nextInt();
		
		for(int i = 1; i<=numOfFood; i++) {
			System.out.print("");
		}
		
		sc.close();

	}

}
