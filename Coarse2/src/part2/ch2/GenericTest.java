package part2.ch2;

import part2.ch2.model.Movie;
import part2.ch2.model.ObjectArray;

public class GenericTest {
    // 1
    public static void main(String[] args) {
        ObjectArray<String> array = new ObjectArray<>(5);
        array.set(0, "Hello");
        array.set(1, "World");
        array.set(2, "Java");
        array.set(3, "Generic");

        for (int i=0; i<array.size(); i++){
            System.out.println(array.get(i));
        }

        ObjectArray<Movie> mList = new ObjectArray<>(5);
        mList.set(0,new Movie("괴물","봉준호",2006,"한국"));
        mList.set(1,new Movie("기생충","봉준호",2019,"한국"));
        mList.set(2,new Movie("완벽한 타인","이재규",2018,"한국"));
        for (int i=0; i<mList.size(); i++){
            System.out.println(mList.get(i));
        }
    }
}
