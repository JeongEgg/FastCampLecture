package com.example.restapi.Get.controller;

import com.example.restapi.Get.model.BookQueryParam;
import org.springframework.web.bind.annotation.*;

@RestController // REST Api를 처리하는 컨트롤러.
@RequestMapping("/api") // 받게 될 주소 설정.
public class RestApiController {

    @GetMapping(path = "/hello")
    public String hello(){
        // 테스트 링크 : "http://localhost:8080/api/hello"
        var html = "<html> <body> <h1> Hello Spring Boot </h1> </body> </html>";
        return html;
    }

    // PATH Variable "/" 문자로 key와 값을 함께 구분함. 값을 보내는 경우에는 '{}'로 감싼다.
    @GetMapping(path = "/echo/{message}/age/{age}/is-man/{isMan}") // 클라이언트로부터 특정 요청을 'message'라는 변수로 받음
    public String echo(
            @PathVariable(name = "message") String msg, // 앞에서 message를 msg로 받는 경우.
            @PathVariable int age, // Integer는 null이 할당될 수 있고, int는 null이 할당될 수 없다.
            @PathVariable boolean isMan
    ){
        // 테스트 링크 : "http://localhost:8080/api/echo/hello/age/29/is-man/true"
        // 테스트 링크 : http://localhost:8080/api/echo/안녕/age/20/is-man/true
        System.out.println("echo message : "+msg); // 한글을 받는 경우에는 문자가 깨질 수 있다.
        System.out.println("echo age : "+age);
        System.out.println("echo isMan : "+isMan);

        // TODO 대문자로 변환해서 RETURN => toUpperCase
        return msg.toUpperCase();
    }

    // Query parameter(쿼리 파라미터 파싱 방법1) -> '?, =, &' 기호를 사용한다.
    @GetMapping(path = "/book")
    public void queryParam(
            @RequestParam String category,
            @RequestParam String issuedYear, // 카멜 기법
            @RequestParam(name = "issued-month") String issuedMonth, // 원칙에 따라가는 코딩
            @RequestParam String issued_day // 추천하지 않는 방식.
    ){
        // 테스트 링크 : http://localhost:8080/api/book?category=IT&issuedYear=2023&issued-month=01&issued_day=31
        System.out.println(category);
        System.out.println(issuedYear);
        System.out.println(issuedMonth);
        System.out.println(issued_day);
    }

    // Query parameter(쿼리 파라미터 파싱 방법2)
    // 테스트 링크1 : http://localhost:8080/api/book2?category=IT&issuedYear=2023&issued-month=01&issued_day=31
    // 테스트 링크2 : http://localhost:8080/api/book2?category=IT&issuedYear=2023&issuedMonth=01&issuedDay=31 (카멜케이스 적용)
    @GetMapping(path = "/book2")
    public void queryParamDto(
            BookQueryParam bookQueryParam
    ){
        System.out.println(bookQueryParam);
        // issuedYear, issued-month 파라미터를 받을 때,
        // 생성자에서의 변수명(issuedMonth, issuedDay)과 다르다.
        // 이 때문에 값을 정상적으로 받지 못한다. -> 동일하게 카멜 케이스를 적용한다.
        // 위와 같이 객체로 받으면, 변수가 많아지는 것을 더 편리하게 나타내도록 할 수 있다.
    }

    /* get 방식(Path Variable, Query Parameter)의 문제점
    *  서버로 전송하는 데이터(주소)가 그대로 노출된다.
    *  서버로 갈 때 거쳐가는 여러가지 장비들(라우터, 엔진엑서(?), 로드밸런싱 해주는 웹서버)에 데이터들이 남게 된다.
    *  HTTP Body에서 특정한 메세지를 담을 수 있다.(Text, Html, Json 등)
    *  HTTP Body로 데이터를 전달하게 되면, 외부 주소에는 해당 주소가 노출되지 않기 때문에, Get 방식보다는 안전하다.
    *  그러나 패킷과 같은 다른 방법으로 HTTP Body의 내용을 확인할 수도 있다.
    *  이 경우, 'Post 방식만 사용 + 암호화'를 하여 데이터를 보호할 수 있다.
    *  HTTP Body에 데이터를 넣는 방식으로 xml, json 방식이 있다.
    * */
}
