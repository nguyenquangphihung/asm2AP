package org.example.CreationalDesignPatterns.AbstractFactory;

interface StudentFactory {
    Student createStudent(String name, int studentID);
//không có thân (body) được khai báo trong giao diện.
//Phương thức này chấp nhận hai tham số name (tên) và studentID (mã số sinh viên) để tạo ra một đối tượng Student.
//Lớp triển khai giao diện StudentFactory cần cung cấp thân phương thức (implementation) cho phương thức này,
// để tạo ra đối tượng Student cụ thể dựa trên tên và mã số sinh viên được cung cấp.
}