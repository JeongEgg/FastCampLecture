package com.example.exception.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping(path = "")
    public void hello(){
        // 2. out of index 에러
        var list = List.of("hello");
        var element = list.get(1); // index 1의 위치에 데이터가 없기 때문에 에러가 발생한다.
        log.info("element : {}",element);

        // 1. 인위적인 에러
//        throw new RuntimeException("run time excepiton call");
        // 에러가 발생함 status code : 500
    }
}
