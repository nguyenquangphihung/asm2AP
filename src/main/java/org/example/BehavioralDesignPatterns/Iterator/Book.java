package org.example.BehavioralDesignPatterns.Iterator;
// khai báo pakage trong java, giúp tổ chức và phân loại các lớp và tài nguyên trong dự án

class Book {
    // định nghĩa 1 lớp book trong gói org.example.BehavioralDesignPatterns.Iterator
    private String title;
    // title có thuộc tính private, và các phương thức khởi tạo, truy xuất gtri thuộc title

    Book(String title) {
        this.title = title;
    }
// định nghĩa một đối tượng sách.
// thuộc tính private là title, kiểu dữ liệu là String, để lưu trữ tiêu đề của sách.

    String getTitle() {
        return title;
        // phương thức getTitle() để truy xuất giá trị của thuộc tính title.
    }
}
//Iterator được sử dụng để duyệt qua các phần tử của một tập hợp (collection) một cách tuần tự.
//
// không cần tiết lộ cấu trúc nội bộ của tập hợp đó.
// để kiểm tra xem còn phần tử nào trong tập hợp,
// truy cập phần tử hiện tại và di chuyển đến phần tử tiếp theo trong tập hợp.

