package org.example.StructuralPatterns.Adapter;

public class AdapterClient {
//Lớp này đại diện cho chương trình sử dụng Adapter pattern để làm việc với đối tượng LegacyStudent.
    public static void main(String[] args) {
        // Sử dụng interface Student với đối tượng StudentAdapter để làm việc với LegacyStudent
        Student student1 = new StudentAdapter(new LegacyStudent("hung1", 12345));
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getStudentID());

        // Sử dụng interface Student với đối tượng StudentAdapter để làm việc với LegacyStudent khác
        Student student2 = new StudentAdapter(new LegacyStudent("hung2", 67890));
        System.out.println("Student Name: " + student2.getName());
        System.out.println("Student ID: " + student2.getStudentID());
    }
}
// lớp AdapterClient chứa phương thức main() để chạy chương trình sử dụng Adapter pattern để làm việc với đối tượng LegacyStudent thông qua interface Student.
// Trong phương thức main, ta sử dụng đối tượng StudentAdapter để chuyển đổi đối tượng LegacyStudent
// và sử dụng các phương thức của interface Student để truy cập thông tin của sinh viên.
//