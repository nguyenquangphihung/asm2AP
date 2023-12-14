package org.example.CreationalDesignPatterns.Singleton;

public class SingletonClient {
//Lớp này đại diện cho chương trình sử dụng lớp StudentManager.
    public static void main(String[] args) {

        StudentManager studentManager = StudentManager.getInstance();

        studentManager.addStudent("hung1");
        studentManager.addStudent("hung2");

        studentManager.displayStudents();

    }
}

// Singleton Nó đảm bảo rằng chỉ có một thể hiện duy nhất của một lớp được tạo ra và mọi người có thể truy cập đến thể hiện này.
// Để triển khai Singleton Pattern, ta sử dụng một constructor private và một phương thức static để truy cập đến thể hiện duy nhất của lớp.
