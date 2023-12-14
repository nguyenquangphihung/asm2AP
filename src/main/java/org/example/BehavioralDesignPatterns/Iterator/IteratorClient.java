package org.example.BehavioralDesignPatterns.Iterator;

import java.util.Iterator;

public class IteratorClient {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book("Design Patterns: Elements of Reusable Object-Oriented Software"));
        library.addBook(new Book("Clean Code: A Handbook of Agile Software Craftsmanship"));
        library.addBook(new Book("The Pragmatic Programmer: Your Journey to Mastery"));

        Iterator<Book> iterator = library.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Book Title: " + book.getTitle());
        }
    }
}
// Trong phương thức main()
//Tạo một đối tượng Library để lưu trữ tập hợp các sách.
//Sử dụng phương thức addBook() để thêm các sách vào tập hợp của thư viện.
//Gọi phương thức createIterator() trên đối tượng Library để tạo một đối tượng Iterator<Book>. Đối tượng này sẽ được sử dụng để duyệt qua các phần tử trong tập hợp sách của thư viện.
//Sử dụng vòng lặp while để duyệt qua các phần tử trong tập hợp sách. Vòng lặp này sẽ chạy cho đến khi không còn phần tử nào trong tập hợp.
//Trong mỗi lần lặp, sử dụng phương thức next() để lấy phần tử tiếp theo trong tập hợp sách và gán vào biến book kiểu Book.
//Sau đó, in ra tiêu đề của sách bằng cách gọi phương thức getTitle() trên đối tượng book.
