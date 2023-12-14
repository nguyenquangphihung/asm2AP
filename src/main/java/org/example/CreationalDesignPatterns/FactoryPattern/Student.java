package org.example.CreationalDesignPatterns.FactoryPattern;

interface Student {
//Giao diện này đại diện cho một sinh viên
    String getDetails();
//Phương thức này không có tham số.
//Phương thức được khai báo mà không có phần thân (body).
//Các lớp triển khai (implement) giao diện Student phải cung cấp phần thân cho phương thức này.
//Phương thức trả về một chuỗi String chứa thông tin chi tiết về sinh viên.
}
//giao diện Student định nghĩa một phương thức getDetails() mà các lớp triển khai giao diện này phải cung cấp phần thân.
// Phương thức này trả về một chuỗi String chứa thông tin chi tiết về sinh viên.
