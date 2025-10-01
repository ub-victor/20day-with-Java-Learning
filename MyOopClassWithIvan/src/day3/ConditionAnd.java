import java.util.Scanner; 

public class ConditionAnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        
        if(mark> 100 || mark<0) {
        	
        	System.out.print("Enter the student's mark: "); 
        	
        	System.out.println("The entered mark is: " + mark);
        	
        	int mark = scanner.nextInt();
        	
        }

        
        int mark = scanner.nextInt();

        
        System.out.println("The entered mark is: " + mark);

        // Close the scanner to release system resources
        scanner.close();
    }
}