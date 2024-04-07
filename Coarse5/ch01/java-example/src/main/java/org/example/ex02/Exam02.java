package org.example.ex02;

public class Exam02 {

    private int a;

    public Exam02(){
        var b = 20; // << 타입 추론
//        var c = null;
        int c = 30;
        int d;
        Integer e = new Integer(100);
        Integer f = 20;
        Integer g = null;

        callFunction(a);
        callFunction(b);
        callFunction(c);
//        callFunction(d); // 초기화가 안되었기 때문에 에러 발생.
        callFunction(e); // null 값이기 때문에 에러 발생.
        callFunction(f);
        callFunction(g);

        // 자바에서는 값이 null인지 아닌지에 따라 개발자가 신경써서 처리해주어야 한다.
    }

    public void callFunction(Integer i){

        var temp = (i==null) ? Integer.valueOf(100) : Integer.valueOf(i);
//        var temp = (i==null) ? "null 값 입니다" : i;
        System.out.println(temp);
    }

    public static void main(String[] agrs){
        new Exam02();
    }
}
