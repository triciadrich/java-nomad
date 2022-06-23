package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        // create scanner
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a high number");
        // assign input to variable as int
        int highNumber = scanner.nextInt();
        // create scanner
        Scanner scanner1 = new Scanner(System.in);
        // prompt user
        System.out.print("Enter a low number");
        // assign input to variable as int
        int lowNumber = scanner1.nextInt();
        double sum = 0;
        double avg = 0;
        int count = 0;
        for(int i = lowNumber; i <= highNumber;i++){
            sum += i;
            count ++;
        }
        avg = sum / count;
        System.out.println("Sum " + sum);
        System.out.println("Average " + avg);
    }
}
