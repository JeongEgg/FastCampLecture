package part4.ch5;

import part4.ch5.model.Animal;
import part4.ch5.model.Cat;
import part4.ch5.model.Dog;

public class IsNotOverride {
    // 1
    public static void main(String[] args) {
        // 재정의를 하지 않았기 때문에 부모가 명령을 내리면(메세지를 보내면) 오동작을 한다.
        // 다형성을 보장하지 않음.
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
    }
}
