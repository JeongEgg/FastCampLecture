package part2.ch3;

import part2.ch3.model.MathOperation;

public class FunctionInterfaceTest3 {
    // 1
    public static void main(String[] args) {
        // MathOpertaion 인터페이스를 익명내부클래스로 구현함.
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x+y;
            }
        };
        int result = mo.operation(10,20);
        System.out.println("result = "+result);
    }
}
