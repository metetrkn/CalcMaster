package se.meteTurkan.calculatorJava;


public class Main {
    public static void main(String[] args) {
        Menu_ menu = new Menu_(); // Creating menu object
        menu.init(); // Initialising menu

        calcScreen screen = new calcScreen();
        if (menu.key) {
            screen.init();
        }
    }
}

/**
 * CHANGE SETNUL() AND MULTIPLYPI() FUNC
 * FUNCTIONS WORKS WELL BUT
 * IT SHOULD NOT ASK 2ND QUESTION
 * JUST CONTINUE TO ASK IN ORDER
 */
