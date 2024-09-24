package se.meteTurkan.calculatorJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionController {
    // Creating Calculator object to be able to manipulate private result attribute
    // for multiply pi function and set-null function
    Calculator cal = new Calculator();

    // Creating calScreen object to manipulate numbers for multiply pi function and set-null function
    CalcScreen screen = new CalcScreen();

    public int checker(int minOption, int maxOption) {
        Scanner  myInput = new Scanner(System.in); // Creating scanner object
        int choice = -1;

        // Checking if user inputted valid value
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


        // If user choose 0-"exit" as operator, it closes the system
        if (choice == 0) {
            String message = "\nExiting...\n";
            int delay = 140; // Delay in milliseconds

            // Looping through each char in message with thread
            for (char c : message.toCharArray()) {
                System.out.print(c);
                try {
                    Thread.sleep(delay);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            System.exit(0); // Exits the program with a status code 0 (indicating normal termination)
        }
        return choice; // Return user choice
    }
}


