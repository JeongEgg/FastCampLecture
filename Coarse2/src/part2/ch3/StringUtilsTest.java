package part2.ch3;

import part2.ch3.model.Converter;
import part2.ch3.model.StringUtils;

public class StringUtilsTest {
    // 2
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        Converter<String, String> converter = stringUtils::reverse;
        String result = converter.convert("hello");
        System.out.println("result = "+result);
    }
}
