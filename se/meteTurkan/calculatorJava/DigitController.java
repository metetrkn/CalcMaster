package se.meteTurkan.calculatorJava;

import java.math.BigDecimal;
import java.util.Scanner;

public class DigitController {
    private Scanner scanner;

    public DigitController(Scanner scanner) {
        this.scanner = scanner;
    }

    public BigDecimal init() {
        // Get user input
        String userInput = getUserInput();

        // Remove trailing zeros
        String result = removeTrailingZeros(userInput);

        // Convert string result into BigDecimal
        return new BigDecimal(result);
    }

    // Method to remove trailing zeros from the decimal part of a number string
    public static String removeTrailingZeros(String number) {
        // Use a regular expression to remove trailing zeros from the decimal part
        return number.contains(".") ? number.replaceAll("\\.?0+$", "") : number;
    }

    // Method to prompt user to input only digits and at most one dot to create a valid decimal number
    public String getUserInput() {
        String input;
        boolean valid;

        do {
            input = scanner.nextLine();

            // Check if input is valid
            valid = input.matches("\\d*\\.?\\d+");

            if (!valid) {
                System.out.println("Invalid input. Please try again.");
            }
        } while (!valid);

        return input;
    }
}