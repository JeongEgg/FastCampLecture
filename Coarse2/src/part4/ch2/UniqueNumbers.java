package part4.ch2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    // 3
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,2,4,6,7,1,3};

        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int number : numbers){
            uniqueNumbers.add(number);
        }

        System.out.println("Unique numbers : ");
        for (int number : uniqueNumbers){
            System.out.println(number);
        }
    }
}
