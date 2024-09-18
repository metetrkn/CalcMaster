package se.meteTurkan.calculatorJava;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(); // Creating menu object
        menu.init(); // Initialising menu

        calcScreen screen = new calcScreen();
        if (menu.key) {
            screen.init();
        }
    }
}
