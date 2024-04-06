package org.example.ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Exam03 {

    private int a;

    public Exam03(){
        var userList = new ArrayList<User>();
        userList.add(new User("1",10));
        userList.add(new User("2",10));
        userList.add(new User("3",10));

        var list = Arrays.asList(
                new User("1",20),
                new User("2",20),
                new User("3",20)
        );

        userList.forEach(System.out::println);

        for (int i=0; i < userList.size(); i++){
            var dto = userList.get(i);
            System.out.println("index : "+i+" user name : "+dto.getName());
        }

        for(User element: userList){
            System.out.println(element);
        }

        // 자바에서도 immutable이 존재하지만, add 메서드를 제공하고 있으며, 이 경우 실행하면 에러가 발생한다.
        var immutable = Collections.unmodifiableCollection(userList); // immutable(불변)
//        immutable.add(new User("5",60));

        var imList = List.of(""); // immutable(불변)
//        imList.add("");
    }

    public static void main(String[] agrs){
        new Exam03();
    }
}

