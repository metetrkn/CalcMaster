package se.meteTurkan.calculatorJava;

// Some libraries to handle precision problem
import java.math.MathContext;
import java.math.BigDecimal;
import java.math.RoundingMode;

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
        return getResult();
    }

    // Subtraction
    public BigDecimal subtract(BigDecimal num) {
        result = result.subtract(num, mc);
        return getResult();
    }

    // Multiplication
    public BigDecimal  multiply(BigDecimal num) {
        result = result.multiply(num, mc);
        return getResult();
    }

    // Dividing method
    public BigDecimal divide(BigDecimal num) {
        // Check for division by zero
        if (num == null || num.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");

            try {
                // Perform division
                result = result.divide(num, mc);
            } catch (ArithmeticException e ) {
                return getResult();
            }
        }

    }


    // Calculate the n-th root of the current result
    public BigDecimal root(BigDecimal num) {
        int n = num.intValue(); // num is the n-th root
        BigDecimal x = new BigDecimal(Math.pow(result.doubleValue(), 1.0 / n));
        result = x.setScale(mc.getPrecision(), RoundingMode.HALF_UP);
        return getResult();
    }

    // Modulus operator - gets remaining
    public BigDecimal remainder(BigDecimal num) {
        result = result.remainder(num);
        return getResult();
    }

    // Exponential
    public BigDecimal pow(BigDecimal num) {
        return getResult();
    }
}

