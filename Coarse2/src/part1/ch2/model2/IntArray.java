package part1.ch2.model2;

import java.util.Arrays;

public class IntArray {
    // 2
    private static final int DEFAULT_CAPACITY = 5;
    private int[] elements;
    private int size = 0;

    public IntArray(){
        elements = new int[DEFAULT_CAPACITY];
    }

    public int size(){
        return size;
    }

    public int get(int index){
        if (index<0 || index >= size){
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }
    public void add(int element){
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++]=element;
    }

    public void ensureCapacity(){
        int nemCapacity = elements.length*2;
        elements=Arrays.copyOf(elements, nemCapacity);
    }
}
