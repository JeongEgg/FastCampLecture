package part1.ch4;

import part1.ch4.model1.BB;
import part1.ch4.model1.CC;

public class InterfaceAPI {
    // 1
    // CC를 이용하여 BB를 동작시키는 프로그램밍(인터페이스 기반의 프로그래밍)
    public static void main(String[] args) {
        CC c = new BB();
        c.x(); // 동적바인딩. BB의 x메서드가 실행됨.
        c.y();
        c.z();
    }
}
