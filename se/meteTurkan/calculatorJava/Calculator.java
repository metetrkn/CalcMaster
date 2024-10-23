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
        return getResult();
    }

    // Subtraction
    public BigDecimal subtract(BigDecimal num) {
        result = result.subtract(num, mc);
        return getResult();
    }

    // Multiplication
    public BigDecimal multiply(BigDecimal num) {
        result = result.multiply(num, mc);
        return getResult();
    }

    // Dividing method
    public BigDecimal divide(BigDecimal num) {
        // Check for division by zero
        if (num == null || num.compareTo(BigDecimal.ZERO) == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
            result = result.divide(num, mc);
            return getResult();
    }
}



