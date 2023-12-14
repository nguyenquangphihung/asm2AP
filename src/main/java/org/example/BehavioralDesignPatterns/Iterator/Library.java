package org.example.BehavioralDesignPatterns.Iterator;
import java.util.List;
import java.util.ArrayList;
// được sử dụng để import các lớp List và ArrayList từ gói java.util. cho phép sử dụng các cấu trúc dữ liệu List và ArrayList để lưu trữ và quản lý tập hợp sách trong lớp Library.
class Library implements BookCollection {
// Lớp Library chứa các thành viên và phương thức để quản lý và truy xuất tập hợp sách.

    private List<Book> books;
// Thuộc tính books là một đối tượng List<Book> để lưu trữ tập hợp các sách trong thư viện.
    Library() {
        this.books = new ArrayList<>();
    }
//Constructor này được sử dụng để khởi tạo đối tượng Library.
// khởi tạo một đối tượng ArrayList<Book> và gán cho thuộc tính books. Điều này tạo ra một thư viện rỗng ban đầu.
    void addBook(Book book) {
        books.add(book);
//  sử dụng để thêm một cuốn sách (đối tượng Book) vào tập hợp sách trong thư viện.
// Phương thức này thêm cuốn sách vào tập hợp books bằng cách sử dụng phương thức add() của lớp ArrayList.
    }

    @Override
    public LibraryIterator createIterator() {

        return new LibraryIterator(books);
// Phương thức này tạo ra và trả về một đối tượng LibraryIterator, sử dụng tập hợp sách books như tham số để khởi tạo đối tượng iterator.
// triển khai từ giao diện BookCollection.
    }
}
// lớp Library được sử dụng để quản lý và truy xuất tập hợp sách.
// Nó triển khai giao diện BookCollection và cung cấp các phương thức như addBook() để thêm sách vào thư viện
// và createIterator() để tạo ra một đối tượng iterator để duyệt qua các phần tử trong tập hợp sách.