package part2.ch2;

import part2.ch2.model.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    // 3
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("hello",1);
        System.out.println("key: "+pair.getKey());
        System.out.println("value: "+pair.getValue());

        // 검색을 빠르게 할 수 있는 자료구조(HashMap, HashTable)
        Map<String, Integer> maps = new HashMap<>();
        maps.put("kor",60);
        maps.put("eng",80);
        maps.put("mat",70);

        System.out.println(maps.get("kor"));
        System.out.println(maps.get("eng"));
        System.out.println(maps.get("mat"));
    }
}
