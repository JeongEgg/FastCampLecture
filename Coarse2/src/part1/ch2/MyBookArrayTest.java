package part1.ch2;

import part1.ch2.model3.Book;
import part1.ch2.model3.BookArray;

public class MyBookArrayTest {
    // 3
    public static void main(String[] args) {
        BookArray list = new BookArray();
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("C++",17000,"대림","이길동"));
        list.add(new Book("Python",16000,"정보","나길동"));

        Book vo = list.get(0);
        System.out.println(vo); // Book{title='자바', price=15000, company='한빛', author='홍길동'}

        vo = list.get(1);
        System.out.println(vo); // Book{title='C++', price=17000, company='대림', author='이길동'}

        vo = list.get(2);
        System.out.println(vo); // Book{title='Python', price=16000, company='정보', author='나길동'}

        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
