package part3.ch4;

import part3.ch4.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO();
        vo.setName("홍길동");
        vo.setAge(50);
        vo.setPhone("010-1111-1111");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
    }
}
