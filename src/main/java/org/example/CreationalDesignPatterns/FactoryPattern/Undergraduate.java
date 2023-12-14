package org.example.CreationalDesignPatterns.FactoryPattern;

class Undergraduate implements Student {
//Lớp này định nghĩa các thuộc tính và phương thức liên quan đến sinh viên đại học.
    private String name;
    private int studentID;
//Lớp Undergraduate có hai thuộc tính private: name (tên) và studentID (mã số sinh viên).
//Thuộc tính name là một chuỗi String, đại diện cho tên của sinh viên đại học.
//Thuộc tính studentID là một số nguyên int, đại diện cho mã số sinh viên của sinh viên đại học.

    Undergraduate(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
//Constructor này nhận vào hai tham số name và studentID để khởi tạo đối tượng Undergraduate.
//Tham số name đại diện cho tên của sinh viên đại học.
//Tham số studentID đại diện cho mã số sinh viên của sinh viên đại học.
//Trong constructor, thuộc tính name và studentID được gán giá trị của các tham số tương ứng.
    }

    @Override
    public String getDetails() {
        return "Undergraduate Student: " + name + ", Student ID: " + studentID;
    }
//Phương thức này triển khai từ giao diện Student.
//Phương thức trả về một chuỗi String chứa thông tin chi tiết về sinh viên đại học.
//Trong đoạn code mẫu, phương thức trả về một chuỗi được tạo thành từ tên của sinh viên đại học và mã số sinh viên của sinh viên đại học.
}
//lớp Undergraduate triển khai giao diện Student và cung cấp các phương thức để lấy thông tin chi tiết về sinh viên đại học.
// Constructor của lớp này được sử dụng để khởi tạo đối tượng Undergraduate với tên và mã số sinh viên được cung cấp.
// Phương thức getDetails() trả về một chuỗi chứa thông tin chi tiết về sinh viên đại học.