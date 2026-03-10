package logging;

import java.util.Scanner;
public class Debug_This {
	
	public static void main(String args[]){
		int a,b, average;
		Scanner value= new Scanner(System.in);
		System.out.println("Enter the firsta number:");
		a=value.nextInt();
		System.out.println("Enter the Second number:");
		b=value.nextInt();
		average=a+b/2; //Here there is a logical error
		System.out.println("The average is="+average); 
	}
}
