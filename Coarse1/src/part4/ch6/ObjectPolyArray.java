package part4.ch6;

import part4.ch6.model.A;
import part4.ch6.model.B;

public class ObjectPolyArray {
    // 3
    public static void main(String[] args) {
        Object[] obj = new Object[2];
        obj[0] = new A();
        obj[1] = new B();
        display(obj);
    }
    private static void display(Object[] obj){
        for (int i=0; i<obj.length; i++){
            if (obj[i] instanceof A){
                ((A)obj[i]).printGo();
            }else {
                ((B)obj[i]).printGo();
            }
        }
    }
}
