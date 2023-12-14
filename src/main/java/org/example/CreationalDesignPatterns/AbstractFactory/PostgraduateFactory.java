package org.example.CreationalDesignPatterns.AbstractFactory;

class PostgraduateFactory implements StudentFactory {
//Lớp này đại diện cho một factory (nhà máy) để tạo ra đối tượng Postgraduate.
    @Override
    public Student createStudent(String name, int studentID) {
        return new Postgraduate(name, studentID);
//Phương thức này triển khai từ giao diện StudentFactory.
//Phương thức nhận vào hai tham số name và studentID, đại diện cho tên và mã số sinh viên của sinh viên sau đại học.
//Trong phương thức, một đối tượng Postgraduate mới được tạo ra bằng cách sử dụng constructor của lớp Postgraduate và truyền vào các tham số tương ứng.
//Phương thức trả về đối tượng Postgraduate đã được tạo.
    }
}
//lớp PostgraduateFactory triển khai giao diện StudentFactory và cung cấp phương thức createStudent() để tạo ra đối tượng Postgraduate.
// Phương thức này sẽ trả về một đối tượng Postgraduate mới được tạo ra bằng cách sử dụng constructor của lớp Postgraduate
// và truyền vào tên và mã số sinh viên được cung cấp.