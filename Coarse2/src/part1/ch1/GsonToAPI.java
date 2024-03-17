package part1.ch1;

import com.google.gson.Gson;
import part1.ch1.model.Person;

public class GsonToAPI {
    // 3
    public static void main(String[] args) {
        Person person = new Person("John",30);
        Gson gson = new Gson();
        String json = gson.toJson(person);
        System.out.println(json); // 자바의 문자열 객체가 json의 형태로 출력됨.

    }
}
