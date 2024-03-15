package part3.ch6;

import part3.ch6.model.MyUtil2;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        MyUtil2 my2 = new MyUtil2();
        int sum = my2.hap(a,b);
        System.out.println(sum);
    }
}
