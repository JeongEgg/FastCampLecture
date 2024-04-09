package org.example.ex07;

public class Exam07 {

    public Exam07(){
        var user = new User();
        user.setName("홍길동");
        user.setAge(10);
        user.setEmail("gmail");
        System.out.println(user);
    }
    public static void main(String[] args) {
        new Exam07();
    }
}
