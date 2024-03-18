package part2.ch3;

import part2.ch3.model.Person;
import part2.ch3.model.PersonFactory;

public class PersonFactoryTest {
    // 2
    public static void main(String[] args) {
        PersonFactory personFactory = Person::new;
        Person person = personFactory.create("홍길동",40);
        System.out.println(person);
    }
}
