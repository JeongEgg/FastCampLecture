package part4.ch2;

import part4.ch2.model.Animal;
import part4.ch2.model.Cat;
import part4.ch2.model.Dog;

public class OverrideTest {
    // 3 수직적 구조의 설계 보완(업캐스팅 및 오버라이딩)
    public static void main(String[] args) {
        // 업캐스팅(Upcasting) : 자바파일이 아닌 클래스 파일만 가진 경우에 업캐스팅을 이용.
        Animal ani = new Dog();
        ani.eat(); // Animal --(동적 바인딩)--> Dog의 eat 실행
        ani = new Cat();
        ani.eat(); // Animal --(동적 바인딩)--> Cat의 eat 실행
    }
}
