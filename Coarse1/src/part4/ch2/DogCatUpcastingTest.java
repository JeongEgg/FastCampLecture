package part4.ch2;

import part4.ch2.model.Animal;
import part4.ch2.model.Cat;
import part4.ch2.model.Dog;

public class DogCatUpcastingTest {
    // 2 수직적 구조 설계
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();
    }
}
