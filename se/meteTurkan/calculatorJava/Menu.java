package se.meteTurkan.calculatorJava;

import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class Menu {
    boolean key = false; // Key to enter into calculator



    // Printing out message from top to bottom line by line func
    public void messagePrint(String[] message) {
        // Printing out line by line with sleep
        for (String line : message) {
            System.out.println(line); // Print each line
            try {
                Thread.sleep(140); // Sleep for 140 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace(); // Handle exception
            }
        }
    }


    // Welcoming menu
    public void welcoming() {
        String[] welcomeArt = {
                " __        __         _                                         _     _ ",
                " \\ \\      / /   ___  | |  ___    ___    _ __ ___     ___        | |_  (_)  _ __     __ _  _ __ ",
                "  \\ \\ /\\ / /   / _ \\ | | / __|  / _ \\  | '_ ` _ \\   / _ \\       | __| | | | '_ \\   / _` || '__|",
                "   \\ V  V /   |  __/ | | \\__ \\ | (_) | | | | | | | |  __/       | |_  | | | | | | | (_| || |   ",
                "    \\_/\\_/     \\___| |_| |___/  \\___/  |_| |_| |_|  \\___|        \\__| |_| |_| |_|  \\__, ||_|   ",
                "                                                                                    |___/      ",
                "                                                                                                ",
                "                               Welcome!                                                        "
        };
        messagePrint(welcomeArt);
    }

    // Operation menu in calculator
    public void operationMenu() {
        System.out.println(
                "\n1. Addition                2. Subtraction           3. Multiplication\n" +
                        "4. Division                5. Root Extraction       6. Exponentiation\n" +
                        "7. Multiply with PI        0. To exit");

    }


public void explanation() {
        System.out.println(
                  """
                  
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

    public int userChoice() {
        Scanner userInput = new Scanner(System.in); // User input object
        OptionController inputC = new OptionController(); // Creating object
        // Calling Input Checker to check if user input a valid option
        //Checking user option (0,1) - possible min,max value
        return inputC.checker(0,1);
    }



    public void printWithDelay(String message) {
        int delay=140; // Delay millisecond
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


    public void LogInCal() {
        key = true;
        String message = "\nLoading...\n";
        printWithDelay(message);
    }


    public void Exiting() {
        String message = "\nExiting...\n";
        printWithDelay(message);
    }

    public char OperationSymbols(int operation) {
        // Creating hashmap for math operations and symbols
        Map<Integer, Character> operations = new HashMap<>();
        operations.put(1, '+');   // Addition
        operations.put(2, '-');   // Subtraction
        operations.put(3, '*');   // Multiplication
        operations.put(4, '/');   // Division
        operations.put(5, '√');   // Root Extraction
        operations.put(6, '^');   // Exponentiation
        operations.put(7, '%');   // Modulus


        // Return the corresponding character or a default character if not found
        return operations.getOrDefault(operation, '?'); // '?' for unknown operation
    }


}

