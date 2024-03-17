package part1.ch2.model4;

import java.util.Arrays;

public class ObjectArray {
    // 4
    private static final int DEFAULT_CAPACITY = 5;
    private Object[] elements;
    private int size = 0;

    public ObjectArray(){
//        elements = new Object[DEFAULT_CAPACITY];
        this(5);
        // 생성자 안에서 다른 생성자를 호출할 때, this 사용
        // 이와 같은 방법으로 결국 항상 아래의 생성자로 Object 배열을 초기화 할 수 있다.
    }
    public ObjectArray(int capacity){
        // 원하는 크기의 배열을 생성.
        elements = new Object[capacity];
    }

    public int size(){
        return size;
    }

    public Object get(int index){
        if (index<0 || index >= size){
            throw new IndexOutOfBoundsException("범위초과");
        }
        return elements[index];
    }
    // Object : 다형성 인수.
    // 매개변수의 타입에 상관없이 해당 타입에 대한 배열을 생성할 수 있음.
    public void add(Object element){
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
