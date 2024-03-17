package part4.ch5;

import part4.ch5.model4.Radio;
import part4.ch5.model4.RemoCon;
import part4.ch5.model4.TV;

public class InterfaceTest2 {
    // 4
    public static void main(String[] args) {
        RemoCon remo = new Radio();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();

        remo = new TV();
        remo.chUp();
        remo.chDown();
        remo.volUp();
        remo.volDown();
        remo.internet();
    }
}
