package com.example.restapi.Post.controller;

import com.example.restapi.Post.model.UserRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostUserApiController {

    /* 테스트
    *  http://localhost:8080/api/postuser
    *  {
           "userName" : "홍길동",
           "userAge" : "29",
           "email" : "hong@gmail.com"
        }
    * */
    @PostMapping("/user")
    public UserRequest post(
            @RequestBody UserRequest userRequest
    ){
        System.out.println(userRequest);
        return userRequest;
    }
}
