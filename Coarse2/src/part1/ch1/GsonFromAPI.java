package part1.ch1;

import com.google.gson.Gson;
import part1.ch1.model.Person;

public class GsonFromAPI {
    // 4
    public static void main(String[] args) {
        String json = "{\"name\":\"John\",\"age\":30}"; // JSON -> Person
        Gson gson = new Gson();
        Person p = gson.fromJson(json, Person.class);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}
