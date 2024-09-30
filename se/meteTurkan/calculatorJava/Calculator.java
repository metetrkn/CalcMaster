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
        return result;
    }

    // Subtraction
    public BigDecimal subtract(BigDecimal num) {
        result = result.subtract(num, mc);
        return result;
    }

    // Multiplication
    public BigDecimal  multiply(BigDecimal num) {
        result = result.multiply(num, mc);
        return result;
    }

    // Dividing
    public BigDecimal divide(BigDecimal num) {
        result = result.divide(num, mc);
        return result;
    }

    // Calculate the n-th root of the current result
    public BigDecimal root(BigDecimal num) {
        int n = num.intValue(); // num is the n-th root
        BigDecimal x = new BigDecimal(Math.pow(result.doubleValue(), 1.0 / n));
        result = x.setScale(mc.getPrecision(), RoundingMode.HALF_UP);
        return result;
    }

    // Modulus operator - gets remaining
    public BigDecimal remainder(BigDecimal num) {
        result = result.remainder(num);
        return result;
    }

    // Exponential
    public BigDecimal pow(BigDecimal num) {
        result = result.pow(num.intValue(), mc);
        return result;
    }
}



//    // To reset result screen
//    public void setNull() {
//        this.result = 0.0;
//    }
//

//
//    public double multiplyPI (double num) {
//        result *= Math.PI;
//        return getResult();
//    }

