package part3.ch6;

public class StaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int sum = hap(a,b);
        System.out.println("sum = "+sum);
    }

    public static int hap(int a, int b){
        int v = a+b;
        return v;
    }
}
