package part2.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","cherry","orange");

        List<String> uppercasedWords = words.stream()
                .map(word->word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("대문자로 변환한 리스트: "+uppercasedWords);
    }
}
