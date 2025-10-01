import java.util.Scanner; 

public class ConditionAnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's mark: "); // Prompt the user for input

        // Read the integer mark entered by the user
        int mark = scanner.nextInt();

        // Display the entered mark
        System.out.println("The entered mark is: " + mark);

        // Close the scanner to release system resources
        scanner.close();
    }
}