// Frantzley Simeon
// January 24, 2023
// This program uses a while loop that continues until the user enters 0.

import java.util.Scanner;
// The Scanner class is used to read input from the user.
public class Counting {
    public static void main(String[] args) {
        int positiveCount = 0;
        int negativeCount = 0;
        int total = 0;
        int count = 0;
// The program uses 3 variables, positive Count, negative Count, and total to keep track of the positive numbers, negative numbers and sum of the inputs respectively. The count variable is used to keep track of the number of inputs.
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer (0 to end input): ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }

            if (num > 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }

            total += num;
            count++;
        }
// Within the while loop, the code prompts the user for an input and then checks whether it is positive, negative or zero. If the input is 0, the loop is exited and the final statistics are displayed. If the input is positive, it increases the positive Count by 1. If the input is negative, it increases the negative Count by 1. 
        double average = (double) total / count;
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
// The program that calculates the average by dividing total by count.
    }
}