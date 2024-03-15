package part4.ch5.model2;

public abstract class Animal {
    public abstract void eat(); // 추상메서드(불완전한 메서드)

    public void move(){
        System.out.println("무리를 지어 이동한다.");
    }
}
