package com.example.validation.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class Api<T> {
    // 에러의 정확한 원인을 클라이언트로 전송하기 위한 클래스
    private String resultCode;
    private String resultMessage;
    @Valid
    private T data;
    private Error error;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
    public static class Error{
        private List<String> errorMessage;
    }
}
