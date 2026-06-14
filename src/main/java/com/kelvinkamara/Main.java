package com.kelvinkamara;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // BigDecimal is the industry standard for financial math
        // because it avoids floating-point precision errors.

        // 2.55 is exactly halfway. Nearest first decimal place even number is 2.6.
        BigDecimal val1 = new BigDecimal("2.55");
        BigDecimal rounded1 = val1.setScale(1, RoundingMode.HALF_EVEN);
        System.out.println("2.55 rounds to: " + rounded1); // Output: 2.6

        // 2.45 is exactly halfway. Nearest first decimal place even number is 2.4.
        BigDecimal val2 = new BigDecimal("2.45");
        BigDecimal rounded2 = val2.setScale(1, RoundingMode.HALF_EVEN);
        System.out.println("2.45 rounds to: " + rounded2); // Output: 2.4
    }
}