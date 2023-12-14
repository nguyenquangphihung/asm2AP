package org.example.BehavioralDesignPatterns.Strategy;

class LuxuryTaxStrategy implements TaxStrategy {
//chứa phương thức để tính toán số thuế dựa trên một mô hình thuế sang trọng.
    @Override
    public double calculateTax(double income) {
//triển khai từ giao diện TaxStrategy.
//nhận vào một tham số income kiểu double, đại diện cho thu nhập.
        return income > 50000 ? income * 0.2 : 0;
//Nếu thu nhập (income) lớn hơn 50000, thì thuế được tính là 20% của thu nhập.
//Ngược lại, nếu thu nhập nhỏ hơn hoặc bằng 50000, thuế được đặt là 0.
    }
}