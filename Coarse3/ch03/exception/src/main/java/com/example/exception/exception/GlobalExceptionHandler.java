package com.example.exception.exception;

import com.example.exception.model.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
@Order // 디폴트 우선순위 -> 예측하지 못한 예외에 대해 가장 마지막에 처리하게 됨.
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Api> exception(
            Exception e
    ){
        log.error("",e);
        var response = Api.builder()
                        .resultCode(String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value()))
                        .resultMessage(HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase())
                        .build();

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(response);
    }
}
