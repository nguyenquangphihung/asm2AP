package org.example.CreationalDesignPatterns.Singleton;
import java.util.ArrayList;
import java.util.List;
public class StudentManager {
//Lớp này đại diện cho một quản lý sinh viên và triển khai mô hình Singleton để chỉ cho phép một đối tượng StudentManager tồn tại.

    private StudentManager() {
        students = new ArrayList<>();
    }
//hiển thị danh sách
    private static StudentManager instance;
//khai báo biến

    private List<String> students;
//
    public static StudentManager getInstance() {
        if (instance == null) {
            instance = new StudentManager();
        }
        return instance;
//sử dụng đk để kiểm tra xem có đúng hay không
    }


    public void addStudent(String studentName) {
        students.add(studentName);
    }
//nhập và thêm sv vào danh sách sinh viên

    public void displayStudents() {
        System.out.println("List of Students:");
        for (String student : students) {
            System.out.println(student);
//Phương thức này hiển thị danh sách sinh viên ra màn hình.
        }
    }
}
//tập hợp tất cả mọi thứ, cho phép mn có thể truy cập vào
