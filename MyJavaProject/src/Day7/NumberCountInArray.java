package Day7;
import java.util.Scanner;
public class NumberCountInArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int []a = {20,50,30,50,10,60,50,80,50};
		
		System.out.print("Enter an number: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		for(int element: a) { // enhanced loop
			if(num == element) {
				count++;
				// break; // so that it may break after getting the first  
			}
			
		}
		
		if(count != 0) {
			System.out.println("Number found " + count + " times" );
			}else {
				System.out.println("Number not found");
			}

	}

}
