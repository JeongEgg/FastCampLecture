package part4.ch5;

import part4.ch5.model3.Radio;
import part4.ch5.model3.RemoCon;
import part4.ch5.model3.TV;

public class InterfaceTest {
    // 3
    public static void main(String[] args) {
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet(); // 오동작

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}
