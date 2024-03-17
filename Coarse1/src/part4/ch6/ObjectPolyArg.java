package part4.ch6;

import part4.ch6.model.A;
import part4.ch6.model.B;

public class ObjectPolyArg {
    // 2
    public static void main(String[] args) {
        A a = new A();
        display(a);
        B b = new B();
        display(b);
    }

    private static void display(Object obj){ // 다형성 인수
        if (obj instanceof A){
            ((A)obj).printGo(); // 다운캐스팅
        }else{
            ((B)obj).printGo(); // 다운캐스
        }

    }

}
