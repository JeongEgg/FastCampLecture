package part3.ch1;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person(); // p : 인스턴스
        p.name = "홍길동";
        p.age = 30;
        p.phone = "010-1111-1111";
        System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p2 = new Person();
        p2.name = "나길동";
        p2.age = 34;
        p2.phone = "010-2222-1111";
        System.out.println(p2.name+"\t"+p2.age+"\t"+p2.phone);
        p2.play();
        p2.eat();
        p2.walk();
    }
}
