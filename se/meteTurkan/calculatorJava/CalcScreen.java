package se.meteTurkan.calculatorJava;

import java.math.BigDecimal;
import java.util.Scanner;

public class CalcScreen {
    // Class attributes
    BigDecimal num; // First inputted number in calculator
    BigDecimal num2; // Second inputted number in calculator
    BigDecimal res; // Result of calculation

    public void init() {
        // Creating objects of related classes
        Calculator cal = new Calculator();
        Menu menu = new Menu();
        OptionController checkOpt = new OptionController();
        DigitController checkDigit = new DigitController();


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
                case 5: {
                    res = cal.root(num2);
                    System.out.printf("\nResult screen:  %s %s %s = %s\n",
                            num.stripTrailingZeros().toPlainString(), menu.OperationSymbols(calOp), num2.stripTrailingZeros().toPlainString(), res.stripTrailingZeros().toPlainString());
                    num = res;
                    break;
                }
//                case 6: {
//                    res = cal.pow(num2.intValue());
//                    System.out.printf("\nResult screen:  %s %s %s = %s\n",
//                            num.stripTrailingZeros().toPlainString(), menu.OperationSymbols(calOp), num2.stripTrailingZeros().toPlainString(), res.stripTrailingZeros().toPlainString());
//                    num = res;
//                    break;
//                }
            }
        }
    }
}
//                } case 7: {
//                    /**
//                     * pi ILE ISLEM YAP
//                     * SONUCU PRINT EYLE
//                     * OPERASYON SOR
//                     * NUM GUNCELLE - OPTIONAL
//                     * BREAK
//                     */
//                    res = cal.multiplyPI(num);
//                    System.out.printf("%s * π = %s\n", num.stripTrailingZeros().toPlainString(), res.stripTrailingZeros().toPlainString());
//                    menu.operationMenu();
//                    num = res; /* !!!!!!!!!!!!!!!!!!!!!!!!!calisip calispmamisina göre bu kismi sil */
//                    break;
//                case 8: {
//                    res = cal.remainder(num2);
//                    System.out.printf("\nResult screen:  %s %s %s = %s\n",
//                            num.stripTrailingZeros().toPlainString(), menu.OperationSymbols(calOp), num2.stripTrailingZeros().toPlainString(), res.stripTrailingZeros().toPlainString());
//                    num = res;
//                    break;
//                }
//                case 9: {
//                    cal.setNull();
//                    System.out.println("\nResult screen:  0");
//                    num = checkDigit.init(); // prompting user to input 1st digit
//                    break;
//                }


