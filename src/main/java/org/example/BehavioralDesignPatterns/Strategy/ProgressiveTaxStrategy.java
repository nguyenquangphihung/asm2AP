package org.example.BehavioralDesignPatterns.Strategy;

class ProgressiveTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
//chứa phương thức để tính toán số thuế dựa trên một mô hình thuế tiến bộ.
        return income * 0.15;
//Thuế được tính bằng 15% của thu nhập (income).
    }
}
