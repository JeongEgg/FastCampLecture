package part2.ch3;

import part2.ch3.model.MathOperation;

public class LambdaExample {
    // 3
    public static void main(String[] args) {
//        MathOperation add = (int x, int y) -> { return x+y; };
        MathOperation add = (x,y) -> x+y;
        int result = add.operation(10,20);
        System.out.println("result = "+result);

        MathOperation multi = (x,y) -> x*y;
        int mulresult = multi.operation(10,20);
        System.out.println("mulresult = "+mulresult);
    }
}
