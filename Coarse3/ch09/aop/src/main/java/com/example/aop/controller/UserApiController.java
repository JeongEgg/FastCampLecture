package com.example.aop.controller;

import com.example.aop.model.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController {


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

}
