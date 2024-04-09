package org.example.ex06;

public class Exam06 {

    public Exam06(){
        var dog = new Dog("퍼피");
        dog.eat();
        dog.bark();
    }
    public static void main(String[] args) {
        new Exam06();
    }
}

abstract class Animal implements  Bark{
    private String name;

    public Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name+" 식사 시작합니다.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{
    public Dog(){
        super("");
    }

    public Dog(String name){
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(this.getName()+" : 멍멍");
    }
}

interface Bark {
    void bark();
}