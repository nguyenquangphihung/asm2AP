package org.example.StructuralPatterns.Bridge;

abstract class StudentAbstraction {
//Lớp này là một lớp trừu tượng và định nghĩa một thuộc tính protected studentType kiểu StudentType.
//Lớp này có một constructor StudentAbstraction(StudentType studentType) để khởi tạo đối tượng StudentAbstraction với một đối tượng StudentType đã cho.
//Lớp này có một phương thức trừu tượng showDetails() không có thân hàm, các lớp con sẽ phải triển khai phương thức này.
    protected StudentType studentType;
//Thuộc tính này lưu trữ thông tin về loại sinh viên (StudentType) của đối tượng StudentAbstraction.
    StudentAbstraction(StudentType studentType) {
        this.studentType = studentType;
    }
//Constructor này nhận một đối tượng StudentType làm tham số và gán cho thuộc tính studentType của lớp.
    abstract void showDetails();
//Phương thức này là một phương thức trừu tượng được khai báo nhưng không có thân hàm.
//Các lớp con của StudentAbstraction sẽ phải triển khai phương thức này để hiển thị thông tin chi tiết về sinh viên.
}
//lớp StudentAbstraction là một lớp trừu tượng đại diện cho một học sinh.
// Lớp này có một thuộc tính studentType để lưu trữ thông tin về loại sinh viên và một phương thức trừu tượng showDetails()
// để hiển thị thông tin chi tiết về sinh viên. Các lớp con của StudentAbstraction sẽ phải triển khai phương thức showDetails().