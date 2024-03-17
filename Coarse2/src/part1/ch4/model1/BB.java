package part1.ch4.model1;

public class BB implements CC{
    // 1
    @Override
    public void x() {
        System.out.println("x 동작이 실행된다.");
    }

    @Override
    public void y() {
        System.out.println("y 동작이 실행된다.");
    }

    @Override
    public void z() {
        System.out.println("z 동작이 실행된다.");
    }
}
