package org.example.CreationalDesignPatterns.AbstractFactory;

class UndergraduateFactory implements StudentFactory {
//đại diện cho một factory (nhà máy) để tạo ra đối tượng Undergraduate.
    @Override
    public Student createStudent(String name, int studentID) {
        return new Undergraduate(name, studentID);
    }
//Phương thức này triển khai từ giao diện StudentFactory.
//Phương thức nhận vào hai tham số name và studentID, đại diện cho tên và mã số sinh viên của sinh viên đại học.
//Trong phương thức, một đối tượng Undergraduate mới được tạo ra bằng cách sử dụng constructor của lớp Undergraduate và truyền vào các tham số tương ứng.
//Phương thức trả về đối tượng Undergraduate đã được tạo.
}
//lớp UndergraduateFactory triển khai giao diện StudentFactory và cung cấp phương thức createStudent() để tạo ra đối tượng Undergraduate.
// Phương thức này sẽ trả về một đối tượng Undergraduate mới được tạo ra bằng cách sử dụng constructor của lớp Undergraduate
// và truyền vào tên và mã số sinh viên được cung cấp.