package part4.ch5.model;

public class Cat extends Animal {
    // 재정의하지 않음 -> 프로그램적으로 오류가 발생하지 않음
    public void night(){
        System.out.println("밤에 눈에서 빛이 난다.");
    }
}
