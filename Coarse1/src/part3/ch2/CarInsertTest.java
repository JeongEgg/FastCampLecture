package part3.ch2;

import part3.ch2.model.CarDAO;
import part3.ch2.model.CarDTO;

import java.util.Scanner;

public class CarInsertTest {
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

        CarDTO car = new CarDTO();
        car.carSn = carSn;
        car.carName = carName;
        car.carPrice = carPrice;
        car.carOwner = carOwner;
        car.carYear = carYear;
        car.carType = carType;

        CarDAO dao = new CarDAO();
        dao.carInsert(car);
        dao.carSelect();
    }
}
