package part2.ch3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    // 6
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven = n->n%2==0;
        int sumOfSquares = numbers.stream()
                                    .filter(StreamExample::isEven)
                                    .sorted()
                                    .map(n->n*n)
                                    .reduce(0, Integer::sum);
        System.out.println("sumOfSquares = "+sumOfSquares);
    }
    public static boolean isEven(int number){
        return number%2==0;
    }
}
