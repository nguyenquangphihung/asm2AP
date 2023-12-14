package org.example.CreationalDesignPatterns.FactoryPattern;

interface StudentFactory {
//Giao diện này đại diện cho một factory (nhà máy) để tạo ra đối tượng Student.
    Student createStudent(String name, int studentID);
//Phương thức này nhận vào hai tham số name và studentID, đại diện cho tên và mã số sinh viên.
//Phương thức được khai báo mà không có phần thân (body).
//Các lớp triển khai (implement) giao diện StudentFactory phải cung cấp phần thân cho phương thức này.
//Phương thức trả về một đối tượng Student mới được tạo ra dựa trên thông tin tên và mã số sinh viên được cung cấp.
}
//giao diện StudentFactory định nghĩa một phương thức createStudent() mà các lớp triển khai giao diện này phải cung cấp phần thân.
// Phương thức này trả về một đối tượng Student mới được tạo ra dựa trên thông tin tên và mã số sinh viên được cung cấp.
