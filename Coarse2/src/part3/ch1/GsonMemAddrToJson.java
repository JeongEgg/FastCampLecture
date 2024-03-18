package part3.ch1;

import com.google.gson.Gson;
import part3.ch1.model.Address;
import part3.ch1.model.Member2;

public class GsonMemAddrToJson {
    // 2
    public static void main(String[] args) {
        Address address = new Address("서울","대한민국");
        Member2 member = new Member2("홍길동",30,"honggildong@example.com",address);

        Gson gson = new Gson();
        String json = gson.toJson(member);

        System.out.println("Member 객체를 JSON으로 변환: "+json);
    }
}
