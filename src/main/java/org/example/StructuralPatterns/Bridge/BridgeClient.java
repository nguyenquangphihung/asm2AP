package org.example.StructuralPatterns.Bridge;

public class BridgeClient {
//Lớp này đại diện cho chương trình sử dụng mẫu thiết kế Bridge để quản lý các loại sinh viên và hiển thị chi tiết của từng loại sinh viên.
    public static void main(String[] args) {
        StudentType undergraduateType = new Undergraduate();
        StudentType postgraduateType = new Postgraduate();

        StudentAbstraction regularStudent = new RegularStudent(undergraduateType);
        StudentAbstraction exchangeStudent = new ExchangeStudent(postgraduateType);

        regularStudent.showDetails();
        exchangeStudent.showDetails();
//Phương thức này là phương thức chính của chương trình, được thực thi khi chạy chương trình.
//Trong phương thức main, ta khởi tạo hai đối tượng kiểu StudentType: undergraduateType và postgraduateType.
//Tiếp theo, ta khởi tạo hai đối tượng kiểu StudentAbstraction: regularStudent và exchangeStudent.
//Đối tượng regularStudent được khởi tạo với undergraduateType, đại diện cho sinh viên đại học thông thường.
//Đối tượng exchangeStudent được khởi tạo với postgraduateType, đại diện cho sinh viên sau đại học.
//Sau đó, ta gọi phương thức showDetails() trên regularStudent và exchangeStudent để hiển thị chi tiết của từng loại sinh viên.
    }
}
//lớp BridgeClient chứa phương thức main() để chạy chương trình sử dụng mẫu thiết kế Bridge.
// Trong phương thức main, ta khởi tạo các đối tượng StudentType và StudentAbstraction để quản lý và hiển thị chi tiết của các loại sinh viên.