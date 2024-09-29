package se.meteTurkan.calculatorJava;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(); // Creating menu object
        menu.welcoming(); // Welcoming user
        menu.explanation(); // Explaining user how to use program


        int choice = menu.userChoice(); // User choice (1-calculator / 0-exit)
        if (choice == 1) {
            menu.LogInCal(); // Logging in calculator
        } else {
            menu.Exiting(); // Exiting calculator
            System.exit(0);
        }

        CalcScreen screen = new CalcScreen(); // Creating object of calculator screens
        screen.init(); // Screen op has started



    }
}


