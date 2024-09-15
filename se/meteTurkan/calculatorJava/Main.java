package se.meteTurkan.calculatorJava;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu(); // Creating menu object
        menu.init(); // Initialising menu

        calcScreen screen = new calcScreen();
        if (menu.key) {
            screen.init();
        }



//        Calculator calculator = new Calculator();

//        while (true) {
//            System.out.println("Input num:");
//            double num = userInput.nextDouble();
//            double result = calculator.add(num);
//            System.out.println("result " + result);
//        }
    }
}
