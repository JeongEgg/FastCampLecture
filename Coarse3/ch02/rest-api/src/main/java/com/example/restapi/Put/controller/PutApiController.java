package com.example.restapi.Put.controller;

import com.example.restapi.Put.model.UserRequestPut;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j // 로그와 관련된 어노테이션
@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public void put(
        @RequestBody
        UserRequestPut userRequestPut
    ){
        log.info("Request : {}",userRequestPut);
        // {} 중괄호에 뒤의 userRequestPut 객체가 맵핑된다.
    }

    /* System.out.println 과 log 출력의 차이
     *  시스템 출력은 콘솔에 먼저 출력한 후 다음줄의 코드가 실행되어 다시 콘솔에 출력한다.
     *  많이 출력을 해야하는 경우, 서버의 처리속도가 저하가 된다.
     *  그러나 log를 통해 출력을 하게 되면, log 자체적으로 버퍼를 가지고 있기 때문에,
     *  해당 버퍼의 내용을 담고, 다음의 코드가 진행된다. 이후 버퍼의 내용이 콘솔에 찍히게 된다.
     *  버퍼 사이즈를 적절히 설정하여, 프로그램이 진행되는 속도에 영향을 주지 않게 된다.
     *  물론 버퍼가 가득차게 되면 영향을 받게 된다.
     *  log를 이용하면 json으로 출력을 하거나, 원하는 포맷으로 출력을 바꿀 수 있다.
     *  언제 요청받았는지, 어떤 쓰레드인지도 확인할 수 있다.
     **/
}
