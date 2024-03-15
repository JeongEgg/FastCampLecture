package part4.ch4;

import part4.ch4.model.Animal;
import part4.ch4.model.Cat;
import part4.ch4.model.Dog;

public class PolyMethodTest {
    // 2 다형성 활용(다형성 인수)
    public static void main(String[] args) {
        Dog d = new Dog();
        display(d);
        Cat c = new Cat();
        display(c);
    }

    public static void display(Animal ani){
        ani.eat();
        if (ani instanceof Cat){
            ((Cat) ani).night();
        }
    }
}
