package se.meteTurkan.calculatorJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionController {
    public int checker(int minOption, int maxOption) {
        Scanner  myInput = new Scanner(System.in); // Creating scanner object
        int choice = -1;

        do {
            try {
                System.out.printf("Press [%d-%d] to make operations.\n", minOption, maxOption); // Prompt user to input
                choice = myInput.nextInt(); // Read user input

                if (choice >= minOption && choice <= maxOption) { // Check if input is within range
                    break; // Exit loop if valid input
                } else {
                    System.out.printf("Invalid input. Please enter an integer between %d and %d.\n", minOption, maxOption); // Print error message
                }
            } catch (InputMismatchException e) { // Catch block to handle InputMismatchException
                System.out.printf("Invalid input. Please enter an integer between %d and %d.\n", minOption, maxOption); // Print error message
                myInput.next(); // Clear the invalid input from the scanner
            }
        } while (true); // Continue loop indefinitely until valid input

        return choice; // Return user choice
    }
}


