package org.example.BehavioralDesignPatterns.Iterator;

public interface BookCollection {
    // khai báo một tập hợp các phương thức trừu tượng (abstract methods) mà các lớp khác có thể triển khai
    LibraryIterator createIterator();
    // Giao diện BookCollection khai báo một phương thức createIterator() mà lớp triển khai giao diện này cần phải định nghĩa.
}
