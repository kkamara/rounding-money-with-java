package com.kelvinkamara;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // BigDecimal is the industry standard for financial math
        // because it avoids floating-point precision errors.

        BigDecimal val = new BigDecimal("2.125");
        BigDecimal step = new BigDecimal("0.01"); // Your rounding increment

        // 1. Divide value by step
        // 2. Round the intermediate result to a whole integer (scale 0) using HALF_UP
        // 3. Multiply by the step to restore original scale
        BigDecimal result = val.divide(step, 0, RoundingMode.HALF_UP)
                               .multiply(step);

        System.out.println(result); // Output: 2.13

        BigDecimal val2 = new BigDecimal("2.555");
        BigDecimal rounded1 = val2.setScale(2, RoundingMode.HALF_EVEN);
        System.out.println(rounded1); // Output: 2.56
    }
}