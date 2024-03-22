package com.example.validation.controller;

import com.example.validation.model.Api;
import com.example.validation.model.UserRegisterRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@Slf4j
@RestController
@RequestMapping("/api/user")
public class UserApiController {


    @PostMapping("")
    public Api<UserRegisterRequest> register( // 와일드 카드(정상 응답, 비정상 응답의 객체 타입이 다름)
           @Valid
           @RequestBody
           Api<UserRegisterRequest> userRegisterRequest
    ){
        log.info("init : {}",userRegisterRequest);

        var body = userRegisterRequest.getData();
        var response = Api.<UserRegisterRequest>builder()
                .resultCode(String.valueOf(HttpStatus.OK.value()))
                .resultMessage(HttpStatus.OK.getReasonPhrase())
                .data(body)
                .build();
        return response; // 정상적인 처리에 대한 응답
    }

//    @PostMapping("")
//    public Api<? extends Object> register( // 와일드 카드(정상 응답, 비정상 응답의 객체 타입이 다름)
//            @Valid
//            @RequestBody
//            Api<UserRegisterRequest> userRegisterRequest,
//
//            BindingResult bindingResult // valid의 검증결과를 담음.
//    ){
//        log.info("init : {}",userRegisterRequest);
//
//        if (bindingResult.hasErrors()){
//            var errorMessageList = bindingResult.getFieldErrors().stream()
//                    .map(it -> {
//                        var format = "%s : { %s } 은 %s";
//                        var message = String.format(format, it.getField(),
//                                                    it.getRejectedValue(), it.getDefaultMessage());
//                        return message;
//                    }).collect(Collectors.toList()); // 에러 메세지 리스트에 추가
//
//            var error = Api.Error
//                    .builder()
//                    .errorMessage(errorMessageList)
//                    .build();
//
//            var errorResponse = Api
//                    .builder()
//                    .resultCode(String.valueOf(HttpStatus.BAD_REQUEST.value()))
//                    .resultMessage(HttpStatus.BAD_REQUEST.getReasonPhrase())
//                    .error(error)
//                    .build();
//
//            return errorResponse; // 에러에 대한 응답
//        }
//
//        var body = userRegisterRequest.getData();
//        var response = Api.<UserRegisterRequest>builder()
//                .resultCode(String.valueOf(HttpStatus.OK.value()))
//                .resultMessage(HttpStatus.OK.getReasonPhrase())
//                .data(body)
//                .build();
//        return response; // 정상적인 처리에 대한 응답
//    }


//    @PostMapping("")
//    public UserRegisterRequest register(
//            @Valid
//            @RequestBody UserRegisterRequest userRegisterRequest
//    ){
//        log.info("init : {}",userRegisterRequest);
//        return userRegisterRequest;
//    }
}
