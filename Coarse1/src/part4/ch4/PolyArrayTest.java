package part4.ch4;

import part4.ch4.model.Animal;
import part4.ch4.model.Cat;
import part4.ch4.model.Dog;

public class PolyArrayTest {
    // 3 다형성 활용(다형성 배열)
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Animal[] ani = new Animal[2];
        ani[0] = d;
        ani[1] = c;
        display(ani);
    }

    public static void display(Animal[] ani){
        for (int i=0; i<ani.length; i++){
            ani[i].eat();
            if (ani[i] instanceof Cat){
                ((Cat) ani[i]).night();
            }
        }
    }
}
