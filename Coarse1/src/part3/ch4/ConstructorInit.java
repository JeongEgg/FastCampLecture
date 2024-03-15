package part3.ch4;

import part3.ch4.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        PersonVO vo1 = new PersonVO("나길동",60,"010-2222-2222");
        PersonVO vo2 = new PersonVO("조길동",50,"010-3333-3333");
        System.out.println(vo1.getName()+"\t"+vo1.getAge()+"\t"+vo1.getPhone());
        System.out.println(vo2.getName()+"\t"+vo2.getAge()+"\t"+vo2.getPhone());
    }
}
