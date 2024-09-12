package se.meteTurkan.calculatorJava;


public class Calculator {
    // Result on screen block
    private double result = 0;
    public void setResult(double result) {
        this.result = result;
    }
    public double getResult() {
        return this.result;
    }

    // Private functions with their public - encapsulation
    private double add(double num1, double num2) {
        return num1 + num2;
    }
    public double add_(double num1, double num) {
        return add(num1, num);
    }

    private double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public double subtract_(double num1, double num2) {
        return subtract(num1, num2);
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
    private double multiply_(double num1, double num2) {
        return multiply(num1, num2);
    }

    private double divide(double num1, double num2) {
        return num1 / num2;
    }
    public double divide_(double num1, double num2) {
        return divide(num1, num2);
    }

    // radix = baseDigit, radical = n-th root
    private double Root(double radix_, double radical_) {
        return Math.pow(radix_, 1.0 / radical_);
    }
    public double Root_(double radix_, double radical_) {
        return Root(radix_, radical_);
    }

    private double exponentiation(double base_, double exponent_) {
        return Math.pow(base_, exponent_);
    }
    public double exponentiation_(double base_, double exponent_) {
        return exponentiation(base_, exponent_);
    }

    // Retuns pi value
    private double piValue() {
        return Math.PI;
    }
    public double piValue_() {
        return piValue();
    }

    // To reset result screen
    private void setNull() {
        this.result = 0.0;
    }
    public void setNull_() {
        setNull();
    }

    // Modulus operator - gets remaining
    private double getRemaining(double num1, double num2) {
        return num1 % num2;
    }
    public double getRemaining_(double num1, double num2) {
        return getRemaining(num1, num2);
    }
}
