package org.example.ex04;

import org.example.ex03.User;

import java.util.*;

public class Exam04 {

    public Exam04(){
        var hashMap = new HashMap<String, Object>();
        hashMap.put("key","value");
        hashMap.put("key2",10);

        var map = Map.of(
            "key1","",
            "key2","",
            "key3",""
        );

        hashMap.get("key");
    }

    public static void main(String[] agrs){
        new Exam04();
    }
}

