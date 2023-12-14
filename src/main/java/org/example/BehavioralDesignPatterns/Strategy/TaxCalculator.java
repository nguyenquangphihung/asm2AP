package org.example.BehavioralDesignPatterns.Strategy;

class TaxCalculator {
    private TaxStrategy taxStrategy;
//được sử dụng để tính toán thuế.
//Ban đầu, giá trị của thuộc tính này được khởi tạo thông qua constructor TaxCalculator().

    TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }
//Constructor này nhận một đối tượng TaxStrategy làm tham số để xác định phương thức tính toán thuế.
//thuộc tính taxStrategy được gán giá trị của tham số taxStrategy.

    void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }
//sử dụng để thiết lập đối tượng TaxStrategy mới.
//Tham số taxStrategy là đối tượng TaxStrategy mới mà bạn muốn sử dụng để tính toán thuế.
//Phương thức này gán giá trị của tham số taxStrategy cho thuộc tính taxStrategy.
    double calculateTax(double income) {
        return taxStrategy.calculateTax(income);
    }
//nhận một tham số income kiểu double, đại diện cho thu nhập.
//Phương thức gọi phương thức calculateTax() của đối tượng taxStrategy và truyền thu nhập vào để tính toán thuế.
// Phương thức trả về giá trị thuế được tính toán bởi đối tượng taxStrategy.
}
//lớp TaxCalculator là một công cụ tính toán thuế. Nó sử dụng một đối tượng TaxStrategy để xác định phương thức tính toán thuế cụ thể.
//có thể thiết lập đối tượng TaxStrategy mới bằng cách sử dụng phương thức setTaxStrategy().
// Phương thức calculateTax() được sử dụng để tính toán số thuế dựa trên đối tượng TaxStrategy hiện tại.
