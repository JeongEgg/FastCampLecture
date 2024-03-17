package part1.ch3;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello,World,Java";
        String[] strArray = str.split(",");
        for (String s : strArray){
            System.out.println(s.toString());
        }
        String str2 = "Hello World  Java";
        String[] strArray2 = str2.split("\\s+");
        for (String s : strArray2){
            System.out.println(s.toString());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요 : ");
        String str3 = scanner.nextLine();
        String[] strArray3 = str3.split("\\s+");
        for (String s : strArray3){
            System.out.println(s.toString());
        }
    }
}
