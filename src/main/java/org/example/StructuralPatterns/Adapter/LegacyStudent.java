package org.example.StructuralPatterns.Adapter;

class LegacyStudent {
//Lớp này đại diện cho một giao diện cũ không tuân thủ giao diện Student.
    private String fullName;
    private int rollNo;
//String fullName: Đại diện cho tên đầy đủ của sinh viên.
//int rollNo: Đại diện cho số hiệu của sinh viên.

    LegacyStudent(String fullName, int rollNo) {
        this.fullName = fullName;
        this.rollNo = rollNo;
//Constructor này nhận vào hai tham số: fullName (tên đầy đủ) và rollNo (số hiệu) của sinh viên.
//Trong constructor, các thuộc tính fullName và rollNo của đối tượng LegacyStudent được khởi tạo từ các tham số tương ứng.
    }

    String getFullName() {
        return fullName;
//Phương thức này trả về tên đầy đủ (fullName) của sinh viên.
    }

    int getRollNo() {
        return rollNo;
    }
//Phương thức này trả về số hiệu (rollNo) của sinh viên.
}
// lớp LegacyStudent đại diện cho một đối tượng sinh viên cũ không tuân thủ giao diện Student.
// Lớp này có các thuộc tính fullName và rollNo, cung cấp các phương thức để truy cập và lấy thông tin của sinh viên như tên đầy đủ và số hiệu.
