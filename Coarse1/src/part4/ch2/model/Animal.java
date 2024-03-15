package part4.ch2.model;

public class Animal {

    public Animal(){
        super(); // 자바의 최상위 클래스인 Object 클래스를 상속받음. Object 객체가 메모리에 먼저 생성됨.
    }
    public void eat(){
        System.out.println("동물처럼 먹다.");
    }
}
