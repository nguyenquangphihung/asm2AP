package org.example.CreationalDesignPatterns.AbstractFactory;

interface Student {
    String getDetails();
//Đây là một phương thức không có thân (body) được khai báo trong giao diện.
//Phương thức này trả về một chuỗi String chứa thông tin chi tiết về sinh viên.
//Lớp triển khai giao diện Student cần cung cấp thân phương thức (implementation) cho phương thức này, để trả về thông tin chi tiết cụ thể về sinh viên.
}
//Tóm lại, giao diện Student định nghĩa một phương thức getDetails() để lấy thông tin chi tiết về một sinh viên.
// Lớp triển khai giao diện này cần cung cấp thân phương thức để trả về thông tin chi tiết cụ thể về sinh viên.