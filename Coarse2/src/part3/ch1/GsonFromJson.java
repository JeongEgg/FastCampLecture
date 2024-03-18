package part3.ch1;

import com.google.gson.Gson;
import part3.ch1.model.Member;

public class GsonFromJson {
    // 1
    public static void main(String[] args) {
        String json = "{\"name\":\"홍길동\",\"age\":30,\"email\":\"hong@example.com\"}";

        Gson gson = new Gson();
        Member member = gson.fromJson(json, Member.class);
        System.out.println("JSON을 Member 객체로 변환: "+member);
    }
}
