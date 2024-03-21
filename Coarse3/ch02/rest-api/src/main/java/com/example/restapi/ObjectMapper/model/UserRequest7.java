package com.example.restapi.ObjectMapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;

@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserRequest7 {
    @JsonProperty("user_names")
    private String userName;
    private Integer userAge;
    private String email;
    private Boolean isKorean;

    private UserRequest7(){}

//    public void setUserNames(String name){
//        this.userName = name;
//    }

    @Override
    public String toString() {
        return "UserRequest7{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", email='" + email + '\'' +
                ", isKorean=" + isKorean +
                '}';
    }
}
