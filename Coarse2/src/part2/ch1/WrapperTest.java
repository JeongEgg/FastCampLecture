package part2.ch1;

public class WrapperTest {
    // 1
    public static void main(String[] args) {
        int a = 10; // 기본 자료형
        Integer aa = new Integer(10); // 사용자정의 자료형
        Integer bb = 10;// Auto-boxing(int 자료형이 자동적으로 Integer 자료형으로 박싱됨)
        System.out.println(bb.intValue()); // Unboxing(Integer -> int)

        Integer cc = new Integer(20);
        int c = cc; // Auto-Unboxing
    }
}
