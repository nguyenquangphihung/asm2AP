package org.example.StructuralPatterns.Adapter;

interface Student {
//Giao diện này định nghĩa hai phương thức: getName() và getStudentID().
    String getName();
//Phương thức này trả về tên của sinh viên dưới dạng một chuỗi (String).

    int getStudentID();
//Phương thức này trả về mã số sinh viên dưới dạng một số nguyên (int).
}
//giao diện Student định nghĩa các phương thức để lấy thông tin của một sinh viên, bao gồm tên và mã số sinh viên.

// cho phép k đôngf bộ có thể giao tiếp với nhau
//