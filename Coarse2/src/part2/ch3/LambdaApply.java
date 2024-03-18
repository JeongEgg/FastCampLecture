package part2.ch3;

import part2.ch3.model.StringOperation;

public class LambdaApply {
    // 4
    public static void main(String[] args) {
        StringOperation toUpperCase = s->s.toUpperCase();
        StringOperation toLowerCase = s->s.toLowerCase();

        String input = "Lambda Expressions";
        System.out.println(processString(input,toUpperCase));
        System.out.println(processString(input,toLowerCase));
    }

    public static String processString(String input, StringOperation operation){
        return operation.apply(input);
    }
}
