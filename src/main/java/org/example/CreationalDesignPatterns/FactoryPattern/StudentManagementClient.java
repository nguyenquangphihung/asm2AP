package org.example.CreationalDesignPatterns.FactoryPattern;

public class StudentManagementClient {
//Lớp này đại diện cho chương trình quản lý sinh viên.
    public static void main(String[] args) {
        StudentFactory undergraduateFactory = new UndergraduateFactory();
        StudentFactory postgraduateFactory = new PostgraduateFactory();

        // Tạo đối tượng sinh viên thông qua Factory
        Student undergraduateStudent = undergraduateFactory.createStudent("hung1", 12345);
        Student postgraduateStudent = postgraduateFactory.createStudent("hung2", 67890);

        // In thông tin sinh viên
        System.out.println(undergraduateStudent.getDetails());
        System.out.println(postgraduateStudent.getDetails());
    }
}
//lớp StudentManagementClient chứa phương thức main() để chạy chương trình quản lý sinh viên.
// Trong phương thức main, ta tạo đối tượng factory để tạo sinh viên và sử dụng factory để tạo ra các đối tượng sinh viên.
// Sau đó, ta in thông tin chi tiết về sinh viên.