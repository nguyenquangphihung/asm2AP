package org.example.CreationalDesignPatterns.AbstractFactory;

public class StudentManagementClient {
    public static void main(String[] args) {
        // Sử dụng Abstract Factory để tạo ra Undergraduate
        StudentFactory undergraduateFactory = new UndergraduateFactory();
        Student undergraduateStudent = undergraduateFactory.createStudent("hung1", 12345);
        System.out.println(undergraduateStudent.getDetails());

        // Sử dụng Abstract Factory để tạo ra Postgraduate
        StudentFactory postgraduateFactory = new PostgraduateFactory();
        Student postgraduateStudent = postgraduateFactory.createStudent("hung2", 67890);
        System.out.println(postgraduateStudent.getDetails());
    }
}
//minh họa cách sử dụng mẫu thiết kế Abstract Factory để tạo ra các đối tượng sinh viên (Undergraduate và Postgraduate)
// thông qua các factory cụ thể (UndergraduateFactory và PostgraduateFactory) mà không cần chỉ định trực tiếp lớp cụ thể của sinh viên.
// Điều này giúp tăng tính linh hoạt và dễ dàng mở rộng khi muốn thêm các loại sinh viên mới trong tương lai.