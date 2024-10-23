package se.meteTurkan.calculatorJava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu(scanner); // Creating menu object

        menu.welcoming(); // Welcoming user
        menu.explanation(); // Explaining user how to use program

        int choice = menu.userChoice(); // User choice (1-calculator / 0-exit)
        if (choice == 1) {
            menu.LogInCal(); // Logging in calculator
        } else {
            menu.Exiting(); // Exiting calculator
            System.exit(0); // Exiting
        }

        CalcScreen screen = new CalcScreen(menu, scanner); // Creating object of calculator screens
        screen.init(); // Screen op has started

        scanner.close(); // Closing scanner

    }
}


