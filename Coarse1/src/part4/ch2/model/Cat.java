package part4.ch2.model;

public class Cat extends Animal{
    // 재정의(Override)
    public void eat(){
        System.out.println("고양이처럼 먹다.");
    }

    public Cat(){
        super(); // Animal 생성자에 대한 객체가 먼저 메모리에 로드됨.
    }
    public void night(){
        System.out.println("밤에 눈에서 빛이 난다.");
    }
}
