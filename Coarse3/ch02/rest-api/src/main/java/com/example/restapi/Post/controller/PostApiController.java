package com.example.restapi.Post.controller;

import com.example.restapi.Post.model.BookRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostApiController {

    // 테스트 링크 : http://localhost:8080/api/post   json 형태
    /*  ex) 클라이언트에서 전송하는 json 데이터 예시
     *  {
     *      "name" : "Spring Boot",
     *      "number" : "100",
     *      "category" : "JAVA"
     *  }
     * */
    @PostMapping("/post")
    public BookRequest post(
        @RequestBody BookRequest bookRequest
        // RequestBody : post, put 방식에서 HTTP Body로 들어오는 데이터를 해당 객체에 데이터를 맵핑해준다.
    ){
        // post 방식은 디폴트로 객체로 받아야 한다.
        /* json 데이터 형태
        *  key : value
        *  {
        *      "key" : "value" ...
        *  }
        *
        *  json 에서 다룰 수 있는 데이터형
        *  String : 문자
        *  Number : 숫자(소숫점, int, double, float) 모두 동일하게 숫자로 받음
        *  Boolean : true / false
        *  {} : Object
        *  [] : array
        * */
        System.out.println(bookRequest);
        return bookRequest;
    }
}
