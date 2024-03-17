package part1.ch3;

public class StringManipulation {
    // 2
    public static void main(String[] args) {
        String str = new String("HelloWorld");
        char firstChar = str.charAt(0);
        String replacedString = str.replaceAll("o","X");
        int index = str.indexOf("W");
        int index2 = str.indexOf("Wr"); // 결과를 못 찾으면 -1 출력.
        int length = str.length();
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        String substring = str.substring(5);


        System.out.println(firstChar);
        System.out.println(replacedString);
        System.out.println(index);
        System.out.println(index2); // 결과를 못 찾으면 -1 출력.
        System.out.println(length);
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(substring);
    }
}
