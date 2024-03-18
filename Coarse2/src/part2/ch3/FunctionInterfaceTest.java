package part2.ch3;

import part2.ch3.model.MathOperation;

public class FunctionInterfaceTest implements MathOperation {
    // 1
    public static void main(String[] args) {
        MathOperation mo = new FunctionInterfaceTest();
        int result = mo.operation(10,20);
        System.out.println("10 + 20 = "+result);
    }
    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
