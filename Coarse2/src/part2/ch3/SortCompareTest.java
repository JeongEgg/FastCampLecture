package part2.ch3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortCompareTest {
    // 2
    public static void main(String[] args) {
        List<String> names = Arrays.asList("홍길동","김길동","이길동");
        Collections.sort(names, String::compareTo);
        System.out.println(names);

        for (String name : names){
            System.out.println(name);
        }
    }
}
