package part4.ch5.model3;

public class Radio extends RemoCon{
    @Override
    public void chUp() {
        System.out.println("Radio의 채널이 올라간다.");
    }
    @Override
    public void chDown() {
        System.out.println("Radio의 채널이 내려간다.");
    }
    @Override
    public void volUp() {
        System.out.println("Radio의 소리가 올라간다.");
    }
    @Override
    public void volDown() {
        System.out.println("Radio의 소리가 내려간다.");
    }
}
