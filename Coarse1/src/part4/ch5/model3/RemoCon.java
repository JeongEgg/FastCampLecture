package part4.ch5.model3;

public abstract class RemoCon {
    // 추상클래스 = 추상메서드 + 구현메서드
    public abstract void chUp();
    public abstract void chDown();
    public abstract void volUp();
    public abstract void volDown();
    public void internet(){
        System.out.println("인터넷이 구동된다.");
    }
}
