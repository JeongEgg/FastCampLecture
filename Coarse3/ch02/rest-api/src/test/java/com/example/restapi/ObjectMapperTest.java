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

//         DTO -> Json (직렬화)
        var json = objectMapper.writeValueAsString(user);
        System.out.println(json);

//         JSon -> DTO (역직렬화)
        var dto = objectMapper.readValue(json, UserRequest.class);
        System.out.println(dto);

        var user2 = new UserRequest2("홍길동",10,"hong@gmail.com",true);
        System.out.println(user2);
        var json2 = objectMapper.writeValueAsString(user2);
        System.out.println(json2);

        var user3 = new UserRequest3("홍길동",10,"hong@gmail.com",true);
        System.out.println(user3);
        var json3 = objectMapper.writeValueAsString(user3);
        System.out.println(json3);

        var user4 = new UserRequest4("홍길동",10,"hong@gmail.com",true);
        System.out.println(user4);
        var json4 = objectMapper.writeValueAsString(user4);
        System.out.println(json4);

        var user5 = new UserRequest5("홍길동",10,"hong@gmail.com",true);
        System.out.println(user5);
        var json5 = objectMapper.writeValueAsString(user5);
        System.out.println(json5);

        var json6 = "{\"user_name\":\"홍길동\",\"user_age\":10,\"email\":\"hong@gmail.com\",\"is_korean\":true}";
        System.out.println(json6);
        var dto6 = objectMapper.readValue(json6, UserRequest6.class);
        System.out.println(dto6);

        var json7 = "{\"user_names\":\"홍길동\",\"user_age\":10,\"email\":\"hong@gmail.com\",\"is_korean\":true}";
        System.out.println(json7);
        var dto7 = objectMapper.readValue(json7, UserRequest7.class);
        System.out.println(dto7);

        var json8 = "{\"user_names\":\"홍길동\",\"user_age\":10,\"email\":\"hong@gmail.com\",\"is_korean\":true}";
        System.out.println(json8);
        var dto8 = objectMapper.readValue(json8, UserRequest8.class);
        System.out.println(dto8);
    }
}
