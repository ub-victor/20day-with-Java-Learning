package Day7;
import  java.util.Scanner;
public class InfoFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Enter your age: ");
		float age = sc.nextInt();
		
		System.out.println("Enter your Salary: ");
		float sal = sc.nextFloat();

		System.out.println("Your name is: "+ name);
		System.out.println("Your age is: "+ age);
		System.out.println("Your salary is: "+ sal+"k");
		

	}

}
