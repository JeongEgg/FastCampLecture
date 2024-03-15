package part4.ch4;

import part4.ch4.model.Animal;
import part4.ch4.model.Cat;
import part4.ch4.model.Dog;

public class PolyTest {
    // 1 다형성 개념
    public static void main(String[] args) {
        // 다형성(message polymorphism)
        Animal ani = new Dog();
        ani.eat();
        ani = new Cat();
        ani.eat();
    }
}
