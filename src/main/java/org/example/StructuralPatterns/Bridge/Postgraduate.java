package org.example.StructuralPatterns.Bridge;
class Postgraduate implements StudentType {
//Lớp này triển khai giao diện StudentType và cung cấp thực thi cho phương thức showType().
    @Override
    public void showType() {
        System.out.println("Postgraduate Student");
    }
//Phương thức này được triển khai từ giao diện StudentType.
//Phương thức này hiển thị thông tin về loại sinh viên, trong trường hợp này là "Postgraduate Student", bằng cách in ra màn hình.
}
// lớp Postgraduate là một lớp triển khai của giao diện StudentType và đại diện cho loại sinh viên sau đại học.
// Lớp này triển khai phương thức showType() để hiển thị thông tin về loại sinh viên là "Postgraduate Student".
