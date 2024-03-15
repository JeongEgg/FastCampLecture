package part3.ch3.model;

public class Person {

    // 상태정보
    public String name;
    public int age;
    public String phone;

    public Person(){}

    // 행위정보
    public void play(){
        System.out.println("운동을 한다.");
    }
    public void eat(){
        System.out.println("음식을 먹다.");
    }
    public void walk(){
        System.out.println("걷다");
    }
}
