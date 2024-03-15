package part3.ch2;

import java.util.Scanner;

public class CarTest {
    // DTO, VO 클래스의 필요성
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("자동차 일련번호:");
        int carSn = scan.nextInt();

        scan.nextLine();
        System.out.print("자동차 이름:");
        String carName = scan.nextLine();

        System.out.print("자동차 가격:");
        int carPrice = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 소유자:");
        String carOwner = scan.nextLine();

        System.out.print("자동차 년식:");
        int carYear = scan.nextInt();

        scan.nextLine();

        System.out.print("자동차 타입:"); // G(휘발유), D(경유)
        String carType = scan.nextLine();

        carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);
    }

    // 매개변수로 자동차의 정보를 받아서 출력하는 메서드 -> 6개의 매개변수를 각각 따로 받아야 함..
    public static void carInfoPrint(int carSn, String carName, int carPrice, String carOwner,
                             int carYear, String carType){
        System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
    }
}
