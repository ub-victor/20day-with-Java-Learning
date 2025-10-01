package day3;

import java.util.Scanner;

public class ConditionAnd {

    public static void main(String[] args) {
        int mark;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the student's mark: ");
        mark = scanner.nextInt();

        if (mark < 100 || mark > 0) {
            System.out.println("The entered mark is invalid (>100 or <0): " + mark);
        } else {
            System.out.println("The entered mark is valid: " + mark);
        }

        scanner.close();
    }
}
