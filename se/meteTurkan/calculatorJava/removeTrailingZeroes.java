package se.meteTurkan.calculatorJava;

public class removeTrailingZeroes {
    public static void main(String[] args) {
        String number1 = "123.45000";
        String number2 = "12345000";
        String result1 = removeTrailingZeros(number1);
        String result2 = removeTrailingZeros(number2);
        System.out.println(result1);  // Outputs: 123.45
        System.out.println(result2);  // Outputs: 12345000
    }

    // Method to remove trailing zeros from the decimal part of a number string
    public static String removeTrailingZeros(String number) {
        // Use a regular expression to remove trailing zeros from the decimal part
        return number.contains(".") ? number.replaceAll("\\.?0+$", "") : number;
    }
}

