package part3.ch4;

import part3.ch4.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("홍길동",34,"010-1111-1111");
        System.out.println(vo.toString());
    }
}
