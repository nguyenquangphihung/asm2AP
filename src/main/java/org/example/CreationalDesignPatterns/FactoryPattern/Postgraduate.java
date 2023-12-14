package org.example.CreationalDesignPatterns.FactoryPattern;

class Postgraduate implements Student {
//định nghĩa các thuộc tính và phương thức liên quan đến sinh viên sau đại học.
    private String name;
    private int studentID;
//Lớp Postgraduate có hai thuộc tính private: name (tên) và studentID (mã số sinh viên).
//Thuộc tính name là một chuỗi String, đại diện cho tên của sinh viên sau đại học.
//Thuộc tính studentID là một số nguyên int, đại diện cho mã số sinh viên của sinh viên sau đại học.


    Postgraduate(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }
//Constructor này nhận vào hai tham số name và studentID để khởi tạo đối tượng Postgraduate.
//Tham số name đại diện cho tên của sinh viên sau đại học.
//Tham số studentID đại diện cho mã số sinh viên của sinh viên sau đại học.
//Trong constructor, thuộc tính name và studentID được gán giá trị của các tham số tương ứng.

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

////nó giúp tạo ra các đối tượng mà không cần chỉ định rõ lớp cụ thể của đối tượng đó.
//// Thay vào đó, Factory Pattern sử dụng một phương thức factory để tạo ra các đối tượng dựa trên các thông tin đầu vào và logic nội bộ.