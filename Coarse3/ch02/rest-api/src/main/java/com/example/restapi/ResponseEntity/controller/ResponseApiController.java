package com.example.restapi.ResponseEntity.controller;

import com.example.restapi.ResponseEntity.model.UserRequestResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@Controller // 페이지 리소스를 리턴해 줄 수 있다.
@RequestMapping("/api/v1")
public class ResponseApiController {

    // 테스트 링크 : http://localhost:8080/api/v1
    @GetMapping("")
//    @RequestMapping(path = "", method = RequestMethod.GET) // GetMapping과 동일함.
//    @RequestMapping(path = "") // method 값이 정해져 있지 않은 경우, 이 메서드는 Get,Post,Put,Delete 등의 모든 맵핑에 대해 동작한다.
    public ResponseEntity<UserRequestResponse> user(){
        var user = new UserRequestResponse();
        user.setUserName("홍길동");
        user.setUserAge(10);
        user.setEmail("hong@gmail.com");

        log.info("user: {}",user);

        var response = ResponseEntity
                .status(HttpStatus.CREATED) // response 값이 200이 아닌 201로 변경됨.
                .header("x-custom","hi")
                .body(user);

        return response;
    }
//    @GetMapping("")
//    @ResponseBody // Controller를 사용하는 경우에 Responsebody 어노테이션을 추가함.(응답이 json 응답)
//    public UserRequestResponse userObject(){
//        var user = new UserRequestResponse();
//        user.setUserName("홍길동");
//        user.setUserAge(10);
//        user.setEmail("hong@gmail.com");
//
//        log.info("userObject: {}",user);
//
//        return user;
//    }


    // 테스트 링크 : http://localhost:8080/api/v1/userstring
    // 문자열 형태로는 잘 리턴하지 않음.
    @GetMapping("/userstring")
    public String userstring(){
        var user = new UserRequestResponse();
        user.setUserName("홍길동");
        user.setUserAge(10);
        user.setEmail("hong@gmail.com");

        log.info("user: {}",user);

        return user.toString();
    }
}

/* 객체(UserRequest) 리턴 vs ResponseEntity
 *  메서드 자체에서는 주로 객체리턴을 사용한다.
 *
 *  해당 로직을 처리하다가 예외가 발생했을 때, 응답코드를 보내려고 할 때, ResponseEntity를 사용한다.
 *  */