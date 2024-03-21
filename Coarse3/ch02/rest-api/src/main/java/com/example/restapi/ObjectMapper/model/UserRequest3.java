package com.example.restapi.ObjectMapper.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserRequest3 {
    private String userName;
    private Integer userAge;
    private String email;
    private Boolean isKorean;

    public String getName(){
        return this.userName;
    }
    public int getHumanAge(){
        return this.userAge;
    }

    @Override
    public String toString() {
        return "UserRequest3{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", email='" + email + '\'' +
                ", isKorean=" + isKorean +
                '}';
    }
}