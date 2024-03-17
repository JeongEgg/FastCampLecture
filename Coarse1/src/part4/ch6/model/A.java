package part4.ch6.model;

import java.lang.*;
public class A extends Object{
    // 기본적인 클래스에는 default package, 최상위 클래스, 디폴트 생성자가 생략되어 있음.
    public A(){
        super();
    }
    public void display(){
        System.out.println("나는 A 입니다.");
    }

    public void printGo(){
        System.out.println("나는 A 입니다.");
    }
}
