package part2.ch3;

import part2.ch3.model.MathOperation;
import part2.ch3.model.MathOperationImpl;

public class FunctionInterfaceTest2 {
    // 1
    public static void main(String[] args) {
        MathOperation mo = new MathOperationImpl();
        int result = mo.operation(10,20);
        System.out.println("10 + 20 = "+result);
    }
}
