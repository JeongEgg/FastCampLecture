package part1.ch2;

import part1.ch2.model3.Book;

import java.util.ArrayList;

public class ArrayListTest {
    // 5
    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // 기본크기 10
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("C++",17000,"대림","이길동"));
        list.add(new Book("Python",16000,"정보","나길동"));

        Book vo = (Book) list.get(0); // 다운캐스팅
        System.out.println(vo.toString());

        vo = (Book) list.get(1);
        System.out.println(vo.toString());

        vo = (Book) list.get(2);
        System.out.println(vo.toString());

        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
