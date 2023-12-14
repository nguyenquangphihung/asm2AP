package org.example.StructuralPatterns.Bridge;

class RegularStudent extends StudentAbstraction {
//Lớp này là một lớp con của lớp StudentAbstraction và triển khai các phương thức của lớp cha.
    RegularStudent(StudentType studentType) {
        super(studentType);
    }
//Constructor này nhận một tham số kiểu StudentType để xác định loại sinh viên.
//Constructor này gọi constructor của lớp cha (StudentAbstraction) và truyền tham số studentType cho nó.

    @Override
    void showDetails() {
        System.out.println("Regular Student Details:");
        studentType.showType();
//Phương thức này được triển khai từ lớp cha (StudentAbstraction).
//Phương thức này hiển thị thông tin chi tiết của sinh viên đại học thông thường bằng cách in ra màn hình "Regular Student Details:".
//Sau đó, phương thức gọi phương thức showType() của đối tượng studentType để hiển thị loại sinh viên.
    }
}
//lớp RegularStudent là một lớp con của lớp StudentAbstraction và đại diện cho sinh viên đại học thông thường.
// Lớp này triển khai phương thức showDetails() để hiển thị thông tin chi tiết của sinh viên đại học thông thường
// bằng cách in ra màn hình "Regular Student Details:" và gọi phương thức showType() của đối tượng studentType để hiển thị loại sinh viên.