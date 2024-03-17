package part4.ch2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    // 3
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple");

        System.out.println("Set size : "+set.size());
        for (String element : set){
            System.out.println(element);
        }

        set.remove("Banana");
        for (String element : set){
            System.out.println(element);
        }

        boolean contains = set.contains("Cherry");
        System.out.println("Set contains Cherry? : "+contains);

        set.clear();

        boolean empty = set.isEmpty();
        System.out.println("Set is empty? : "+empty);

    }
}
