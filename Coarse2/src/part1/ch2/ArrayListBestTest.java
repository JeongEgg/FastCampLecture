package part1.ch2;

import part1.ch2.model3.Book;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBestTest {
    // 5
    public static void main(String[] args) {
        // <> : 제네릭(제네릭에서 정의한 타입의 배열만 생성됨. 업캐스팅, 다운캐스팅이 필요없어짐.)
        List<Book> list = new ArrayList<Book>(); // 기본크기 10
        list.add(new Book("자바",15000,"한빛","홍길동"));
        list.add(new Book("C++",17000,"대림","이길동"));
        list.add(new Book("Python",16000,"정보","나길동"));

        Book vo = list.get(0); // 다운캐스팅
        System.out.println(vo.toString());

        vo = list.get(1);
        System.out.println(vo.toString());

        vo = list.get(2);
        System.out.println(vo.toString());

        for (int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
