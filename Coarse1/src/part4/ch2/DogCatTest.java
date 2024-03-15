package part4.ch2;

import part4.ch2.model.Cat;
import part4.ch2.model.Dog;

public class DogCatTest {
    // 1 수평적 구조 설계
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();

        Cat c = new Cat();
        c.eat();
        c.night();
    }
}
