package part2.ch2;

import part2.ch2.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGeneric {
    // 2
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Movie("괴물","봉준호",2006,"한국"));
        list.add("Hello"); // 타입이 보장되지 않음.
        System.out.println(list.get(0));
        System.out.println(list.get(1));

        List<Movie> list2 = new ArrayList<>();
        list2.add(new Movie("괴물","봉준호",2006,"한국"));
        list2.add(new Movie("기생충","봉준호",2019,"한국"));
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
    }
}
