package part2.ch1;

import java.util.ArrayList;

public class ListExample {
    // 5
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("banana"); // 중복 데이터 추가

        System.out.println("첫 번째 데이터 : "+list.get(0));
        System.out.println("두 번째 데이터 : "+list.get(1));
        System.out.println("마지막 데이터 : "+list.get(list.size()-1));

        list.remove(0); // 데이터 삭제
        list.set(1, "orange"); // 데이터 수정
        for (String str : list){
            System.out.println(str);
        }
    }
}
