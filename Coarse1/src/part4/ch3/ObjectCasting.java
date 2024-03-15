package part4.ch3;

import part4.ch2.model.Animal;
import part4.ch2.model.Cat;
import part4.ch2.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal --> Dog, Cat
        Animal ani = new Dog();// 업캐스팅
        ani.eat();
        ani = new Cat(); // 업캐스팅
        ani.eat();

        Cat c = (Cat) ani; // 다운캐스팅
//        c.night();
        ((Cat)ani).night();
    }
}
