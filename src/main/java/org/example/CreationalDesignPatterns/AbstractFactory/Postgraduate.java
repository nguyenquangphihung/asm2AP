package org.example.CreationalDesignPatterns.AbstractFactory;

class Postgraduate implements Student {
//Lớp này định nghĩa các thuộc tính và phương thức liên quan đến sinh viên sau đại học.
    private String name;
    private int studentID;
//Lớp Postgraduate có hai thuộc tính private: name (tên) và studentID (mã số sinh viên).
//Thuộc tính name là một chuỗi String, đại diện cho tên của sinh viên sau đại học.
//Thuộc tính studentID là một số nguyên int, đại diện cho mã số sinh viên của sinh viên sau đại học.

    Postgraduate(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
//nhận vào hai tham số name và studentID để khởi tạo đối tượng Postgraduate.
//Tham số name đại diện cho tên của sinh viên sau đại học.
//Tham số studentID đại diện cho mã số sinh viên của sinh viên sau đại học.
//Trong constructor, thuộc tính name và studentID được gán giá trị của các tham số tương ứng.
    }

    @Override
    public String getDetails() {
        return "Postgraduate Student: " + name + ", Student ID: " + studentID;
    }
//Phương thức này triển khai từ giao diện Student.
//Phương thức trả về một chuỗi String chứa thông tin chi tiết về sinh viên sau đại học.
//Trong đoạn code mẫu, phương thức trả về một chuỗi được tạo thành từ tên của sinh viên sau đại học và mã số sinh viên của sinh viên sau đại học.
}
//lớp Postgraduate triển khai giao diện Student và cung cấp các phương thức để lấy thông tin chi tiết về sinh viên sau đại học.
// Constructor của lớp này được sử dụng để khởi tạo đối tượng Postgraduate với tên và mã số sinh viên được cung cấp.
// Phương thức getDetails() trả về một chuỗi chứa thông tin chi tiết về sinh viên sau đại học.


//Abstract Factory Pattern cung cấp một giao diện trừu tượng để tạo ra các đối tượng liên quan hoặc phụ thuộc lẫn nhau mà không cần chỉ định rõ các lớp cụ thể.
// Một abstract factory cung cấp phương thức tạo ra các đối tượng có quan hệ logic hoặc chức năng chung,
// trong khi các lớp con triển khai abstract factory này xác định cách tạo ra các đối tượng cụ thể.

