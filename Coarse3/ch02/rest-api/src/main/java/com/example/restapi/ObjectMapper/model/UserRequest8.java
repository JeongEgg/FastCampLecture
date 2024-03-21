package com.example.restapi.ObjectMapper.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserRequest8 {
    @JsonProperty("user_names")
    private String userName;
    @JsonProperty("user_age")
    private Integer userAge;
    @JsonProperty("email")
    private String email;
    @JsonProperty("is_korean")
    private Boolean isKorean;
    @Override
    public String toString() {
        return "UserRequest8{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", email='" + email + '\'' +
                ", isKorean=" + isKorean +
                '}';
    }
}
