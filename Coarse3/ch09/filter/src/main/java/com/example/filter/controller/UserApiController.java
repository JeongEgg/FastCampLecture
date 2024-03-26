package com.example.filter.controller;

import com.example.filter.interceptor.OpenApi;
import com.example.filter.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController {

    @OpenApi
    @PostMapping("")
    public UserRequest register(
        @RequestBody
        UserRequest userRequest
    ){
        log.info("{}",userRequest);
        return userRequest;
    }

    @GetMapping("/hello")
    public void hello(){
        log.info("hello");
    }

//    @PostMapping("")
//    public void register(
//        HttpEntity http
//    ){
//        log.info("{}",http.getBody());
//    }

//    @PostMapping("")
//    public void register(
//        @RequestBody
//        UserRequest userRequest
//    ){
//        log.info("{}",userRequest);
//    }
}
