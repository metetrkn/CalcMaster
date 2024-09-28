package se.meteTurkan.calculatorJava;

// Some libraries to handle precision problem
import java.math.MathContext;
import java.math.BigDecimal;

public class Calculator {
    // Result on screen block
    private BigDecimal result;

    // Set method
    public void setResult(double result) {
        this.result = BigDecimal.valueOf(result);
    }

    // Get method
    public BigDecimal getResult() {
        return this.result;
    }

//    // Addition
//    public double add(double num) {
//        result += num;
//        return getResult();
//    }

//    // Subtraction
//    public double subtract(double num) {
//        result -= num;
//        return getResult();
//    }
//
//    public double multiply(double num) {
//        result *= num;
//        return getResult();
//    }

    public BigDecimal divide(BigDecimal num) {
        MathContext mc = new MathContext(10); // Precision of 10 digits
        result = result.divide(num, mc);
        return result;
    }

//    // radix = baseDigit, radical = n-th root
//    public double Root(double radical_) {
//        result = Math.pow(result, 1.0 / radical_);
//        return getResult();
//    }

//    public double exponentiation(double exponent_) {
//        result = Math.pow(result, exponent_);
//        return getResult();
//    }
//
//    // To reset result screen
//    public void setNull() {
//        this.result = 0.0;
//    }
//
//    // Modulus operator - gets remaining
//    public double getRemaining(double num) {
//        result %= num;
//        return getResult();
//    }
//
//    public double multiplyPI (double num) {
//        result *= Math.PI;
//        return getResult();
//    }
}
