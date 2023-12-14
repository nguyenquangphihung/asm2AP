package org.example.BehavioralDesignPatterns.Strategy;

public class StrategyClient {
    public static void main(String[] args) {
        TaxCalculator calculator = new TaxCalculator(new ProgressiveTaxStrategy());
//TaxCalculator là một lớp đại diện cho một công cụ tính toán thuế. Nó sử dụng một chiến lược tính thuế để thực hiện các phép tính.
        double income1 = 50000;
        double tax1 = calculator.calculateTax(income1);
        System.out.println("Tax for income " + income1 + ": $" + tax1);

        // Chuyển đổi chiến lược tính thuế
        calculator.setTaxStrategy(new FlatTaxStrategy());

        double income2 = 70000;
        double tax2 = calculator.calculateTax(income2);
        System.out.println("Tax for income " + income2 + ": $" + tax2);

        // Chuyển đổi chiến lược tính thuế
        calculator.setTaxStrategy(new LuxuryTaxStrategy());

        double income3 = 80000;
        double tax3 = calculator.calculateTax(income3);
        System.out.println("Tax for income " + income3 + ": $" + tax3);
    }
}