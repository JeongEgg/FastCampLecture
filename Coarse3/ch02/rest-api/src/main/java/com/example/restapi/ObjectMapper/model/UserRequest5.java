package com.example.restapi.ObjectMapper.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserRequest5 {
    private String userName;
    private Integer userAge;

    @JsonProperty("user_email")
    private String email;
    private Boolean isKorean;

    public String getUserName() {
        return userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public String getEmail() {
        return email;
    }

    public Boolean getIsKorean() {
        return isKorean;
    }

    @JsonIgnore
    public String getUser(){
        return userName;
    }

    @Override
    public String toString() {
        return "UserRequest4{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", email='" + email + '\'' +
                ", isKorean=" + isKorean +
                '}';
    }
}
