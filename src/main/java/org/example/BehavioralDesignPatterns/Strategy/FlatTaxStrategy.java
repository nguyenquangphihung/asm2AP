package org.example.BehavioralDesignPatterns.Strategy;
//lớp FlatTaxStrategy được định nghĩa trong gói org.example.BehavioralDesignPatterns.Strategy.
class FlatTaxStrategy implements TaxStrategy {
//chứa phương thức để tính toán số thuế dựa trên một mô hình thuế cố định.
    @Override
    public double calculateTax(double income) {
//Phương thức này triển khai từ giao diện TaxStrategy.
        return 1000;
//giả sử logic tính thuế theo mô hình thuế cố định được đặt là 1000.
// Điều này có nghĩa là phương thức sẽ luôn trả về giá trị thuế là 1000, bất kể giá trị của thu nhập.
    }
}

//stratery được sử dụng để tách rời thuật toán từ class sử dụng thuật toán đó và cho phép thay đổi thuật toán một cách linh hoạt trong thời gian chạy.