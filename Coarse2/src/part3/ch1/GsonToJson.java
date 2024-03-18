package part3.ch1;

import com.google.gson.Gson;
import part3.ch1.model.Member;

public class GsonToJson {
    // 1
    public static void main(String[] args) {
        Member member = new Member("홍길동",30,"hong@example.com");

        Gson gson = new Gson();
        String json = gson.toJson(member);
        System.out.println("Member 객체를 JSON으로 변환: "+json);
    }
}
