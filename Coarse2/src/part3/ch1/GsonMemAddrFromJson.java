package part3.ch1;

import com.google.gson.Gson;
import part3.ch1.model.Member2;

public class GsonMemAddrFromJson {
    // 2
    public static void main(String[] args) {
        String json = "{" +
                            "\"name\":\"홍길동\"," +
                            "\"age\":30," +
                            "\"email\":\"honggildong@example.com\"," +
                            "\"address\":{" +
                                "\"city\":\"서울\"," +
                                "\"country\":\"대한민국\"" +
                            "}" +
                        "}";
        Gson gson = new Gson();
        Member2 member = gson.fromJson(json, Member2.class);
        System.out.println("JSON을 Member 객체로 변환: "+member);
    }
}
