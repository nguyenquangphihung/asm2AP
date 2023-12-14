package org.example.StructuralPatterns.Composite;

public class    CompositeClient {
//Lớp này chứa phương thức main() để thực hiện ví dụ về Composite Pattern.
    public static void main(String[] args) {
        // Tạo đối tượng sinh viên
        StudentComponent student1 = new StudentLeaf("hung1");
        StudentComponent student2 = new StudentLeaf("hung2");

        // Tạo đối tượng nhóm
        GroupComposite group1 = new GroupComposite("Group 1");
        group1.addMember(student1);
        group1.addMember(student2);

        // Hiển thị thông tin sinh viên và nhóm
        student1.displayDetails();
        System.out.println();

        student2.displayDetails();
        System.out.println();

        group1.displayDetails();
    }
}
//lớp CompositeClient chứa phương thức main() để thực hiện một ví dụ về sử dụng Composite Pattern.
// Trong ví dụ này, tạo đối tượng sinh viên và nhóm, sau đó hiển thị thông tin chi tiết về các đối tượng này.