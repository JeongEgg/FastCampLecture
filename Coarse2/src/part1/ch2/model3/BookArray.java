package part1.ch2.model3;

import java.util.Arrays;

public class BookArray {
    // 3
    private static final int DEFAULT_CAPACITY = 5;
    private Book[] elements;
    private int size = 0;

    public BookArray(){
        elements = new Book[DEFAULT_CAPACITY];
    }

    public int size(){
        return size;
    }

    public Book get(int index){
        if (index<0 || index >= size){
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }
    public void add(Book element){
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++]=element;
    }

    public void ensureCapacity(){
        int nemCapacity = elements.length*2;
        elements= Arrays.copyOf(elements, nemCapacity);
    }
}
