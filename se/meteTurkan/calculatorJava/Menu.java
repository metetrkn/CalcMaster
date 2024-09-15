package se.meteTurkan.calculatorJava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    boolean key = false; // Key to enter into calculator

    public void init(){
        welcoming();
        LogInExit();
    }

    // Operation menu in calculator
    public void operationMenu() {
        System.out.println(
                "\n1. Addition                2. Subtraction           3. Multiplication\n" +
                        "4. Division                5. Root Extraction       6. Exponentiation\n" +
                        "7. Multiply with PI        8. Modulus               9. Resetting Result Screen\n");

    }

    // Welcoming menu
    public void welcoming() {
        System.out.println(
                """
                 ~~~~            ||||            ~~~~
                      Welcome to CalcMaster 1.0.1
                 ~~~~            ||||            ~~~~
                 
                  
                  Sample Usage:
                 
                 1. The program prompts the user to enter the first number and press Enter.
                     Example:
                     Result screen: // Enter the 1st digit then press Enter
                     User input: 5
                     Result screen: 5
                 
                 2. The program then asks the user to select an operation by entering the corresponding number and pressing Enter.
                     Example:
                     Result screen: // Enter the operation number (e.g., 1 for addition) then press Enter
                     User input: 1
                     Result screen: 5 +
                 
                 3. The program prompts the user to enter the second number and press Enter.
                     Example:
                     Result screen: // Enter the 2nd number then press Enter
                     User input: 3
                     Result screen: 5 + 3
                 
                 4. The program displays the result of the operation.
                     Example:
                     Result screen: 8
                 
                 <1> to calculator and <0> for exit!
                 
                 """
        );

    }


    // Welcoming menu
    public void LogInExit() {
        Scanner userInput = new Scanner(System.in); // User input object

        // Calling Input Checker to check if user input a valid option
        InputCheck inputC = new InputCheck(); // Creating object
        int input = inputC.checker(0,1); //Checking user option (0,1) - possible min,max value

        // The user either logs in to the system or exits.
        if (input == 1) {
            key = true;
            String message = "\nLoading...\n";
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
        } else {
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
        }
    }
}

