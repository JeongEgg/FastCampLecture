package com.example.restapi.ObjectMapper.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserRequest2 {
    private String userName;
    private Integer userAge;
    private String email;
    private Boolean isKorean;

    @Override
    public String toString() {
        return "UserRequest2{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", email='" + email + '\'' +
                ", isKorean=" + isKorean +
                '}';
    }
}
