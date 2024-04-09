package org.example.ex05;


import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exam05 {

    private Predicate<String> stringPredicate = new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return s.equals("?");
        }
    };

    public Exam05(){
        // 고차함수

        var strList = List.of(
            "1",
            "2",
            "홍길동",
            "함수",
            "메서드"
        );
        var result = strList.stream()
            .filter(
                (String s) -> s.equals("")
//                new Predicate<String>() {
//                    @Override
//                    public boolean test(String s) {
//                        return s.equals("");
//                    }
//                }

//                it -> it.equals("?")
            )
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        new Exam05();
    }
}
