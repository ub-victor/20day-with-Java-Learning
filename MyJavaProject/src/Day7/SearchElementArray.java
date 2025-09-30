package Day7;
import java.util.Scanner;

public class SearchElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 40, 50, 30, 20};

        System.out.println("Enter a number to search:");
        int searchNum = sc.nextInt();

        boolean found = false; // flag to track if number is found

        for (int i = 0; i < arr.length; i++) {
            if (searchNum == arr[i]) {
                found = true; // mark as found
                break;        // stop searching once found
            }
        }

        if (found) {
            System.out.println(searchNum + " found in the array");
        } else {
            System.out.println(searchNum + " not found in the array");
        }
    }
}
