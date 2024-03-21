package com.example.restapi.Delete.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class DeleteApiController {

    // 테스트 링크 : http://localhost:8080/api/user/abcd/delete
    @DeleteMapping(path ={
            "/user/{userName}/delete",
            "/user/{userName}/del"
        }
    )
    public void delete(
        @PathVariable String userName
    ){
        log.info("user-name : {}",userName);
    }
    /* path를 사용하면 2가지의 주소 형식도 사용가능하다. 그러나 1가지의 주소 형식을 사용하는 것이 좋고
     *  실수하여 새로운 링크가 필요한 경우 2개를 사용하여 클라이언트에서 마이그레이션 하는 주소를 알려주고,
     *  모든 클라이언트에서 주소를 다 마이그레이션 하면, 이전의 주소를 지워주는 방식으로 사용할 수 있다.*/
}
