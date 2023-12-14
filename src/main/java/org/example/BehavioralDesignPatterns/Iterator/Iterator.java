package org.example.BehavioralDesignPatterns.Iterator;

interface Iterator<T> {
// được tham số hóa bởi một kiểu dữ liệu đại diện bằng biến T.
// cho phép được sử dụng với các kiểu dữ liệu khác nhau.
    boolean hasNext();
    // Phương thức này trả về một giá trị boolean, true nếu vẫn còn phần tử trong tập hợp và false nếu không còn.
    // kiểm tra xem còn pt nào trong tập hợp hay k
    T next();
    // sử dụng để lấy phần tử tiếp theo trong tập hợp.
}
