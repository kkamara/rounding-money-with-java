package com.kelvinkamara;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // BigDecimal is the industry standard for financial math
        // because it avoids floating-point precision errors.

        // 2.5 is exactly halfway. Nearest even number is 2.
        BigDecimal val1 = new BigDecimal("2.5");
        BigDecimal rounded1 = val1.setScale(0, RoundingMode.HALF_EVEN);
        System.out.println("2.5 rounds to: " + rounded1); // Output: 2

        // 3.5 is exactly halfway. Nearest even number is 4.
        BigDecimal val2 = new BigDecimal("3.5");
        BigDecimal rounded2 = val2.setScale(0, RoundingMode.HALF_EVEN);
        System.out.println("3.5 rounds to: " + rounded2); // Output: 4
    }
}