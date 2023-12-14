package org.example.BehavioralDesignPatterns.Iterator;
import java.util.Iterator;
import java.util.List;
//được sử dụng để import giao diện Iterator và lớp List từ gói java.util.
// Điều này cho phép chúng ta sử dụng giao diện Iterator và lớp List để triển khai và quản lý tập hợp sách trong lớp LibraryIterator.
class LibraryIterator implements Iterator<Book> {
//chứa các thành viên và phương thức để duyệt qua tập hợp sách trong thư viện.
    private List<Book> books;
//Thuộc tính books là một đối tượng List<Book> để lưu trữ tập hợp các sách trong thư viện.
    private int index;
//Thuộc tính index là một số nguyên để theo dõi vị trí hiện tại trong tập hợp sách.
    LibraryIterator(List<Book> books) {
//Constructor sử dụng để khởi tạo đối tượng LibraryIterator.
        this.books = books;
        this.index = 0;
//Constructor này nhận một đối tượng List<Book> làm tham số để xác định tập hợp sách và khởi tạo thuộc tính books với giá trị của tham số.
//Thuộc tính index được khởi tạo với giá trị 0, đại diện cho vị trí đầu tiên trong tập hợp sách.
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }
//kiểm tra xem biến index có nhỏ hơn kích thước của bộ books sưu tập hay không.
// Nếu indexkích thước nhỏ hơn, điều đó có nghĩa là có nhiều sách hơn để lặp lại, vì vậy phương thức trả về true. Ngược lại, nó trả về false,
// cho biết không còn phần tử nào nữa.
    @Override
    public Book next() {
        return books.get(index++);
    }
// Nó trả về cuốn sách ở indexvị trí hiện tại trong booksbộ sưu tập và sau đó tăng indexbiến lên một.
// Điều này đảm bảo rằng lệnh gọi tiếp theo next()sẽ trả về cuốn sách tiếp theo trong bộ sưu tập.
}
//LibraryIterator được sử dụng để duyệt qua tập hợp sách trong thư viện.
// Nó triển khai giao diện Iterator<Book> và cung cấp các phương thức hasNext() để kiểm tra xem còn phần tử tiếp theo hay không,
// và next() để trả về phần tử tiếp theo trong tập hợp sách.