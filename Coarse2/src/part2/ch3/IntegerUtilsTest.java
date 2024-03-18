package part2.ch3;

import part2.ch3.model.Converter;
import part2.ch3.model.IntegerUtils;

public class IntegerUtilsTest {
    // 2
    public static void main(String[] args) {
        Converter<String, Integer> converter = IntegerUtils::stringToInt;
        Integer result = converter.convert("123");
        System.out.println("result = "+result);
    }
}
