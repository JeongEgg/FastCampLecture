package part3.ch6;

import part3.ch6.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int sum = MyUtil.hap(a,b);
        System.out.println(sum);
    }
}
