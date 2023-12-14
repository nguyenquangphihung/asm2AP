package org.example.StructuralPatterns.Adapter;

class StudentAdapter implements Student {
//Lớp này triển khai giao diện Student và cung cấp chức năng chuyển đổi từ đối tượng LegacyStudent thành một đối tượng thích hợp cho giao diện Student.
    private LegacyStudent legacyStudent;
//Thuộc tính này là một đối tượng LegacyStudent mà StudentAdapter sẽ làm việc với.

    StudentAdapter(LegacyStudent legacyStudent) {
        this.legacyStudent = legacyStudent;
    }
//Constructor này nhận một đối tượng LegacyStudent làm tham số và gán cho thuộc tính legacyStudent.
    @Override
    public String getName() {
        return legacyStudent.getFullName();
    }
//Phương thức này triển khai từ giao diện Student và trả về tên đầy đủ (fullName) của đối tượng LegacyStudent thông qua phương thức getFullName().
    @Override
    public int getStudentID() {
        return legacyStudent.getRollNo();
    }
//Phương thức này triển khai từ giao diện Student và trả về số hiệu (rollNo) của đối tượng LegacyStudent thông qua phương thức getRollNo().
}

//std adapter để kết nối std với legacystd