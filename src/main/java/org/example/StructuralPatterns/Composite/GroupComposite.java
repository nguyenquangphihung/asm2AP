package org.example.StructuralPatterns.Composite;
import java.util.ArrayList;
import java.util.List;
class GroupComposite implements StudentComponent {
    private String groupName;
    private List<StudentComponent> members;
//Lớp này triển khai giao diện StudentComponent và cung cấp thực thi cho phương thức displayDetails().
//Lớp này có thuộc tính private String groupName để lưu trữ tên của nhóm sinh viên.
//Lớp này có một danh sách members kiểu List<StudentComponent> để lưu trữ các thành viên trong nhóm.
    GroupComposite(String groupName) {
        this.groupName = groupName;
        this.members = new ArrayList<>();
//Constructor này nhận một tham số là tên của nhóm sinh viên và khởi tạo đối tượng GroupComposite với tên đó.
//Constructor này cũng khởi tạo danh sách members bằng một ArrayList mới.
    }

    void addMember(StudentComponent member) {
        members.add(member);
    }
//Phương thức này được sử dụng để thêm một thành viên (StudentComponent) vào danh sách members của nhóm.

    @Override
    public void displayDetails() {
        System.out.println("Group: " + groupName);
        System.out.println("Members:");
        for (StudentComponent member : members) {
            member.displayDetails();
//Phương thức này được triển khai từ giao diện StudentComponent.
//Phương thức này hiển thị thông tin chi tiết về nhóm sinh viên bằng cách in ra tên nhóm và danh sách các thành viên trong nhóm.
//Để hiển thị thông tin chi tiết về từng thành viên, phương thức sử dụng vòng lặp để gọi phương thức displayDetails() của từng thành viên.
        }
    }
}
//lớp GroupComposite là một lớp triển khai của giao diện StudentComponent và đại diện cho một nhóm sinh viên.
// Lớp này có tên nhóm và danh sách thành viên, và triển khai phương thức displayDetails() để hiển thị thông tin chi tiết về nhóm và các thành viên trong nhóm.
