package com.example.restapi;

import com.example.restapi.ObjectMapper.model.*;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ObjectMapperTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void contextLoads() throws JsonProcessingException {
        var user = new UserRequest();
        user.setUserName("홍길동");
        user.setUserAge(10);
        user.setEmail("hong@gmail.com");
        user.setIsKorean(true);

        // DTO -> Json (직렬화)
        var json = objectMapper.writeValueAsString(user);
        System.out.println(json);

        // JSon -> DTO (역직렬화)
        var dto = objectMapper.readValue(json, UserRequest.class);
        System.out.println(dto);

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();
        var user2 = new UserRequest2("홍길동",10,"hong@gmail.com",true);
        // get,set 없이 생성자만 존재함 -> 객체 자체를 출력할 때, 출력이 이상하게 나타남.
        System.out.println(user2);
        // 메서드가 없는 경우 이상한 값으로 출력된다.
        // toString() 메서드가 있는 경우(get,set 메서드가 없는 경우) toString 을 출력한다.

        var json2 = objectMapper.writeValueAsString(user2);
        System.out.println(json2);

        /** ObjectMapper가 동작하는 방식은 변수에 맵핑되지 않고, 메서드에 맵핑된다.
         *  ObjectMapper는 직렬화(DTO -> json)를 할 때, 변수가 아닌 get이 들어간 메서드를 기준으로 맵핑한다.
         *
         *  get 메서드를 기존의 이름이 아닌, 새로운 이름으로 클래스에 생성한 경우, 새롭게 정의한 이름에 맵핑되어
         *  snake case로 json을 출력한다.*/

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();

        var user3 = new UserRequest3("홍길동",10,"hong@gmail.com",true);

        var json3 = objectMapper.writeValueAsString(user3);
        System.out.println(json3);

        var dto3 = objectMapper.readValue(json3, UserRequest3.class);
        System.out.println(dto3);

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();

        var json4 = "{\"user_name\":\"홍길동\",\"user_age\":10,\"email\":\"hong@gmail.com\",\"is_korean\":true}";
        System.out.println(json4);

        var dto4 = objectMapper.readValue(json4, UserRequest4.class);
        /* 디폴트 생성자를 private로 막았는데, ObjectMapper는 어떻게 객체를 만들었는가?
        *  ObjectMapper는 reflection을 기반으로 동작하기 때문에 인스턴스를 생성할 수 있다.
        * */
        System.out.println(dto4);
        /* 데이터가 맵핑이 되지 않는 결과를 얻는다.(get,set,생성자를 정의하지 않은 경우.)
        *  */

        System.out.println();
        System.out.println("--------------------------------------------------------------------");
        System.out.println();

        /* getter 또는 setter 둘 중의 하나가 있더라도 값을 출력할 수 있게 된다. */
        var json5 = "{\"user_names\":\"홍길동\",\"user_age\":10,\"email\":\"hong@gmail.com\",\"is_korean\":true}";
        System.out.println(json5);
        /* 주입되는 json 데이터 key를 'user_names'로 정의하였다. Dto로 출력할 때 null 로 출력이 된다.
        *  주입되는 json의 키값과 클래스에 정의된 변수명이 다를 경우, set 메서드를 해당 데이터의 json 키 값에 맞게
        *  정의한 경우 정상적으로 출력할 수 있다. 여기서 set메서드를 새로 정의하기보다는 JsonProperty를 사용하는 것이
        *  더 편리할 것이다.*/

        var dto5 = objectMapper.readValue(json5, UserRequest5.class);
        System.out.println(dto5);
        // readValue는 json을 dto로 바꿀 떄, 기본적으로 set 메서드를 참고하는데, set 메서드가 없는 경우 get 메서드도 참고할 수 있다.
    }
}
