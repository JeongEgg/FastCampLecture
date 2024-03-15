package part4.ch4.model;

public class Dog extends Animal {
    // 재정의(Override)
    public void eat(){
        System.out.println("개처럼 먹다");
    }
    public Dog(){
        super();// Animal 생성자에 대한 객체가 먼저 메모리에 로드됨.
    }
}
