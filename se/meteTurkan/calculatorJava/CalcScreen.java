package se.meteTurkan.calculatorJava;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalcScreen {
    // Class attributes
    BigDecimal num; // First inputted number in calculator
    BigDecimal num2; // Second inputted number in calculator
    BigDecimal res; // Result of calculation

    Menu menu;
    Scanner scanner;

    public CalcScreen( Menu menu, Scanner scanner) {
        this.menu = menu;
        this.scanner = scanner;
    }

    public void init() {
        // Creating objects of related classes
        Calculator cal = new Calculator();
        OptionController checkOpt = new OptionController(scanner);
        DigitController checkDigit = new DigitController(scanner);


        // Getting 1st number from user
        System.out.print("Enter the 1st digit then press Enter:\nResult screen:  ");
        num = checkDigit.init();
        System.out.println();


        // Setting number on calculators result screen as 1st inputed digit
        cal.setResult(num);


        // Keep continue operations until user closes
        while (true) {
            menu.operationMenu(); // Printing out menu on screen before every operation

            int calOp = checkOpt.checker(0, 9); // Checking if user input is valid, users calculation choice

            // Getting math operation from user
            System.out.printf("Result screen:  %s %s\n", num.stripTrailingZeros().toPlainString(), menu.OperationSymbols(calOp));

            // Getting 2nd number from user
            System.out.print("\nEnter the 2nd number then press Enter: ");
            num2 = checkDigit.init();

            switch (calOp) {
                case 1: {
                    res = cal.add(num2);
                    System.out.printf("\nResult screen:  %s %s %s = %s\n",
                            num.stripTrailingZeros().toPlainString(), menu.OperationSymbols(calOp), num2.stripTrailingZeros().toPlainString(), res.stripTrailingZeros().toPlainString());
                    num = res;
                    break;
                }
                case 2: {
                    res = cal.subtract(num2);
                    System.out.printf("\nResult screen:  %s %s %s = %s\n",
                            num.stripTrailingZeros().toPlainString(), menu.OperationSymbols(calOp), num2.stripTrailingZeros().toPlainString(), res.stripTrailingZeros().toPlainString());
                    num = res;
                    break;
                }
                case 3: {
                    res = cal.multiply(num2);
                    System.out.printf("\nResult screen:  %s %s %s = %s\n",
                            num.stripTrailingZeros().toPlainString(), menu.OperationSymbols(calOp), num2.stripTrailingZeros().toPlainString(), res.stripTrailingZeros().toPlainString());
                    num = res;
                    break;
                }
                case 4: {
                    res = cal.divide(num2);
                    System.out.printf("\nResult screen:  %s %s %s = %s\n",
                            num.stripTrailingZeros().toPlainString(), menu.OperationSymbols(calOp), num2.stripTrailingZeros().toPlainString(), res.stripTrailingZeros().toPlainString());
                    num = res;
                    break;
                }
                default:
                    System.out.println("\nA problem has occurred!\n");
            }
        }
    }
}

