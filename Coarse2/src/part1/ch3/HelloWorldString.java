package part1.ch3;

public class HelloWorldString {
    // 1
    public static void main(String[] args) {
        String str = new String("HelloWorld"); // Heap
        System.out.println(str.toString());

        String str1="HelloWorld"; // Literal Pool
        System.out.println(str1.toString());
    }
}
