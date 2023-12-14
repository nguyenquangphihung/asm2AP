package org.example.StructuralPatterns.Composite;

class StudentLeaf implements StudentComponent {
//Lớp này triển khai giao diện StudentComponent và cung cấp thực thi cho phương thức displayDetails().
//Lớp này có thuộc tính private String name để lưu trữ tên của sinh viên.
    private String name;
    StudentLeaf(String name) {
        this.name = name;
    }
////Constructor này nhận một tham số là tên của sinh viên và khởi tạo đối tượng StudentLeaf với tên đó.
    @Override
    public void displayDetails() {
        System.out.println("Student: " + name);
    }
//Phương thức này được triển khai từ giao diện StudentComponent.
//Phương thức này hiển thị thông tin chi tiết về sinh viên bằng cách in ra tên của sinh viên.
}
