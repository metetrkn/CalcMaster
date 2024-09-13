package se.meteTurkan.calculatorJava;


public class Calculator {
    // Result on screen block
    private double result = 0;

    // Set method
    public void setResult(double result) {
        this.result = result;
    }

    // Get method
    public double getResult() {
        return this.result;
    }

    // Addition
    public double add(double num) {
        result += num;
        return getResult();
    }

    // Subtraction
    public double subtract(double num) {
        result -= num;
        return getResult();
    }

    public double multiply(double num) {
        result *= num;
        return getResult();
    }

    public double divide(double num) {
        result /= num;
        return getResult();
    }

    // radix = baseDigit, radical = n-th root
    public double Root(double radical_) {
        result = Math.pow(result, 1.0 / radical_);
        return getResult();
    }

    public double exponentiation(double exponent_) {
        result = Math.pow(result, exponent_);
        return getResult();
    }

    // Multiply with pi value
    public double piMultiply() {
        result *= Math.PI;
        return result;
    }

    // To reset result screen
    public void setNull() {
        this.result = 0.0;
    }

    // Modulus operator - gets remaining
    public double getRemaining(double num) {
        result %= num;
        return getResult();
    }
}
