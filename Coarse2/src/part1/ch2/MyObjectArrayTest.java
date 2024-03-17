package part1.ch2;

import part1.ch2.model4.A;
import part1.ch2.model4.B;
import part1.ch2.model4.C;
import part1.ch2.model4.ObjectArray;

public class MyObjectArrayTest {
    // 4
    public static void main(String[] args) {
        ObjectArray list = new ObjectArray();
        list.add(new A()); // 업캐스팅
        list.add(new B());
        list.add(new C());

        A a =(A) list.get(0); // 다운캐스팅
        a.display();

        B b =(B) list.get(1);
        b.display();

        C c =(C) list.get(2);
        c.display();

        for (int i=0; i< list.size(); i++){
            if (list.get(i) instanceof A){
                ((A)list.get(i)).display();
            }else if (list.get(i) instanceof B){
                ((B)list.get(i)).display();
            }else {
                ((C)list.get(i)).display();
            }
        }
    }
}
