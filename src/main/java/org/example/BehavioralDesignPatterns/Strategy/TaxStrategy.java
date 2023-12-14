package org.example.BehavioralDesignPatterns.Strategy;

public interface TaxStrategy {
//phương thức không có thân
//chấp nhận một tham số income kiểu double, đại diện cho thu nhập.
//Lớp triển khai giao diện TaxStrategy cần cung cấp thân phương thức (implementation) cho phương thức này,
// để thực hiện logic tính toán thuế dựa trên mô hình thuế cụ thể.
    double calculateTax(double income);
//Phương thức calculateTax() trả về một giá trị kiểu double, đại diện cho số thuế được tính toán.
}
//giao diện TaxStrategy định nghĩa một phương thức calculateTax() để tính toán số thuế dựa trên thu nhập.
// Lớp triển khai giao diện này cần cung cấp thân phương thức để thực hiện logic tính toán thuế dựa trên mô hình thuế cụ thể.

