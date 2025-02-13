/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialcalculator;

import java.util.Scanner;

/**
 *
 * @author BOCADO_CpE121
 */
public class FactorialCalculator {

    // Method to calculate factorial recursively
    public static long calculateFactorial(int n) {
        // Base case: factorial of 0 is 1
        if (n == 0) {
            return 1;
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i; // Multiply result by the current number
        }

        return result;
    }

    // Method to display a nice output message
    public static void displayMessage(int number, long result) {
        System.out.println("\n===============================");
        System.out.printf("      Factorial Calculator\n");
        System.out.println("===============================");
        System.out.printf("The factorial of %d is: %,d\n", number, result);
        System.out.println("===============================");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a non-negative integer
        System.out.print("Please enter a non-negative integer: ");

        // Validate the input
        if (!scanner.hasNextInt()) {
            System.out.println("Oops! That's not a valid integer. Please enter a valid non-negative integer.");
        } else {
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Error: Factorial is undefined for negative numbers. Please enter a non-negative integer.");
            } else {
                // Calculate factorial and display result
                long factorial = calculateFactorial(number);
                displayMessage(number, factorial);
            }
        }

        // Close the scanner to free resources
        scanner.close();
    }
}
