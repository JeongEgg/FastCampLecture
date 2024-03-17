package part4.ch6;

import part4.ch6.model.A;

public class ObjectTest {
    // 1
    public static void main(String[] args) {
        A a = new A();
        a.display();

        Object obj = new A(); // Upcasting
        ((A)obj).display();// Downcasting
        // Object는 최상위 클래스이기 때문에, 하위 클래스 A의 display 메서드에 접근하기 위해 downcasting을 한다.
        // 객체를 Object로 생성해야 하는 경우도 있기 때문에 아래와 같은 방법도 알고 있어야 한다.
    }
}
