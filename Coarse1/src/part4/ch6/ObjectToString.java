package part4.ch6;

import part4.ch6.model.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b = new Board();
        b.setTitle("게시글입니다.");
        System.out.println(b.getTitle());
        System.out.println(b.toString());
    }
}
