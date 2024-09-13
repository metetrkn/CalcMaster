package se.meteTurkan.calculatorJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    boolean key = false; // Key to enter into calculator
    // Operation menu in calculator
    static void menu() {
          System.out.println(
                  "\n1. Addition                2. Subtraction           3. Multiplication\n" +
                  "4. Division                5. Root Extraction       6. Exponentiation\n" +
                  "7. Multiply with PI        8. Modulus               9. Resetting Result Screen");
      }
    void welcoming() {
        // Menu
        System.out.println(
                "\n~~~~            ||||           ~~~~\n" +
                        "    Welcome to CalcMaster 1.0.1\n" +
                        "~~~~            ||||           ~~~~\n\n" +
                        "Here is a list what you can do:\n");

        menu(); // Calling menu method

        System.out.println("Please press 1 to start calculator, press 0 to exit. \n");



        Scanner userInput = new Scanner(System.in); // User input object

        int input=-1; // Sample initialising

        // Prompt user until getting either 1 or 0
        do {
            try {
                System.out.print("Press 1 to access the calculator or 0 to exit: "); // Prompting user to input
                input = userInput.nextInt(); // Read user input
            } catch (InputMismatchException e) { // Catch block to handle InputMismatchException
                System.out.println("Invalid input. Please enter an integer: 1 to access the calculator or 0 to exit."); // Print error message
                userInput.next(); // Clear the invalid input from the scanner
            }
        } while (input != 0 && input != 1); // Continue the loop until the user enters 0 or 1

        if (input==1) {
            key = true;
            String message = "\nLoading...\n";
            int delay = 140; // Delay in milliseconds

            // Looping through each char in message with thread
            for (char c : message.toCharArray()) {
                System.out.print(c);
                try { Thread.sleep(delay); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }} else {
            String message = "\nExiting...\n";
            int delay = 140; // Delay in milliseconds

            // Looping through each char in message with thread
            for (char c : message.toCharArray()) {
                System.out.print(c);
                try { Thread.sleep(delay); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            }
        }
    }

//
//        // If user inputs byte
//        if (userInput.hasNextInt()) {
//            if (input == 1) {
//                key = true;
//            } else if (input == 0) {
//                key = false;
//            } else {
//                System.out.println("Please press either 1 or 0!");
//            }
//        } else {
//            System.out.println("Please enter only digits!");
//        }


    /**
     * CREATE A USER FRIENDLY
     * CLI MENU FOR USER
     * THAT WILL WELCOMING
     * PROMPT USER TO INPUT
     * CAN MAKE CALCULATIONS BASED
     * ON THE LAST RESULT SHOWN ON
     * THE SCREEN, JUST LIKE REAL CALCULATOR
     * USE ENCAPSULATION GET AND SET METHODS
     */
}
