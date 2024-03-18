package part2.ch3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamAPITest {
    // 5
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sumOfEvens = Arrays.stream(numbers)
                                .filter(n-> n%2==0)
                                .sum();
        System.out.println("sumOfEvens = "+sumOfEvens);

        int[] evenNumbers = Arrays.stream(numbers)
                                    .filter(n->n%2==0)
                                    .toArray();
        for (int even : evenNumbers){
            System.out.println("even = "+even);
        }
    }
}
