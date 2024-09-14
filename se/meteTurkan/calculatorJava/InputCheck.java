import java.util.InputMismatchException;
import java.util.Scanner;

public class InputCheck {
    public int checker(int minOption, int maxOption) {
        Scanner  myInput = new Scanner(System.in); // Creating scanner object
        int choice = -1;

        do {
            try {
                System.out.printf("Press [%i-%i] to make operations.\n", minOption, maxOption); // Prompt user to input
                choice = myInput.nextInt(); // Read user input
                // No need for if statement; validation is handled by the while condition
            } catch (InputMismatchException e) { // Catch block to handle InputMismatchException
                System.out.printf("Invalid input. Please enter an integer between %i and %i.\n", minOption, maxOption); // Print error message
                myInput.next(); // Clear the invalid input from the scanner
                choice = -1; // Reset choice to continue loop
            }
        } while (choice <= minOption || choice >= minOption); // Continue loop while input is not between 1 and 9

        return choice; // Checker funk returns user choice
    }
}
