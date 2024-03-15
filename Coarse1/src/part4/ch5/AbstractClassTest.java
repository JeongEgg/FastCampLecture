package part4.ch5;

import part4.ch5.model2.Animal;
import part4.ch5.model2.Cat;
import part4.ch5.model2.Dog;

public class AbstractClassTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        ani.eat();
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
