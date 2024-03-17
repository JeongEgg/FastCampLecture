package part2.ch1;

import java.util.ArrayList;

public class CollectionBasic {
    // 4
    public static void main(String[] args) {
        // int --x--> Object[] -> ArrayList
        // Integer(Wrapper) --o--> Object[] -> ArrayList
        // int --(Auto-boxing:Integer)--> Object[] -> ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //  Integer --(Auto-unboxing)--> int
        for (int data : list){
            System.out.println(data);
        }
    }
}
