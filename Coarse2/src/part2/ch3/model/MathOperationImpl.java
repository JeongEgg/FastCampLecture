package part2.ch3.model;

public class MathOperationImpl implements MathOperation{
    // 1
    // 구현체를 이용한 방법
    @Override
    public int operation(int x, int y) {
        return x+y;
    }
}
