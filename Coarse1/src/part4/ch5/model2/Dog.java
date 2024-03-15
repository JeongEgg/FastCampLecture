package part4.ch5.model2;

import part4.ch5.model2.Animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("개처럼 먹다.");
    }
}
