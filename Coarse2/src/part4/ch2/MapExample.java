package part4.ch2;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    // 4
    public static void main(String[] args) {
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Kim",95);
        studentScores.put("Lee",95);
        studentScores.put("Park",95);
        studentScores.put("Choi",95);

        System.out.println("Kim's score: "+studentScores.get("Kim"));
        System.out.println("Lee's score: "+studentScores.get("Lee"));

        studentScores.put("Park",92);
        System.out.println("Park's score after update: "+studentScores.get("Park"));

        studentScores.remove("Choi");
        System.out.println("Choi's score after update: "+studentScores.get("Choi"));

        for (Map.Entry<String, Integer> entry:studentScores.entrySet()){
            System.out.println(entry.getKey()+"'s score: "+entry.getValue());
        }
    }
}
