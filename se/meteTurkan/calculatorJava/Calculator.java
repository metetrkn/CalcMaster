package se.meteTurkan.calculatorJava;

// Some libraries to handle precision problem
import java.math.MathContext;
import java.math.BigDecimal;

public class Calculator {
    // Result on screen block
    private BigDecimal result;

    MathContext mc = new MathContext(10); // Precision of 10 digits

    // Set method
    public void setResult(BigDecimal result) {
        this.result = result;
    }

    // Get method
    public BigDecimal getResult() {
        return this.result;
    }

    // Addition
    public BigDecimal add(BigDecimal num) {
        result = result.add(num, mc);
        return result;
    }

    // Subtraction
    public BigDecimal subtract(BigDecimal num) {
        result = result.subtract(num, mc);
        return result;
    }

    public BigDecimal  multiply(BigDecimal num) {
        result = result.multiply(num, mc);
        return result;
    }

    public BigDecimal divide(BigDecimal num) {
        result = result.divide(num, mc);
        return result;
    }
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

