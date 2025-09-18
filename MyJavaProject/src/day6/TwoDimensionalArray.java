package day6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// Declare
		
		int a [][]= new int [3][2];
		
//		a[0][0] = 10;
//		a[0][1] = 20;
//		a[1][0] = 30;
//		a[1][0] = 40;
//		a[2][0] = 50;
//		a[2][1] = 60;
		
		//Method2
		int [][] b = {
				{10,20},
				{30,40},
				{50,60}};
		
		// Find size of an array
		
		System.out.println("Number of rows: " + a.length); // no. of rows
		System.out.println("Number of columns "+a[0].length); // no. of columns
		// To read single value from an array
		System.out.println(b[0][0]);
		System.out.println(b[0][1]);
		
		// Way of writing multiple value from an array
		/* 
		    When row=0, col=0 → prints b[0][0] = 10

			When row=0, col=1 → prints b[0][1] = 20
			
			When row=1, col=0 → prints b[1][0] = 30
			
			When row=1, col=1 → prints b[1][1] = 40
			
			When row=2, col=0 → prints b[2][0] = 50
			
			When row=2, col=1 → prints b[2][1] = 60
		 */
		
		for(int row = 0; row<3; row++) { // Outer loop
			for(int col=0; col<2; col++) { // inner loop
				System.out.print(b[row][col] + " "); // let us use print, not println
			}
			System.out.println(); // move to new line after each row
		}

	}

}
