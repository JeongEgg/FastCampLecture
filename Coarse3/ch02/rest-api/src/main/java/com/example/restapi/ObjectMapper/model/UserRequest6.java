package com.example.restapi.ObjectMapper.model;



import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Getter;
import lombok.Setter;

@Getter
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserRequest6 {
    private String userName;
    private Integer userAge;
    private String email;
    private Boolean isKorean;

    private UserRequest6(){}

    @Override
    public String toString() {
        return "UserRequest6{" +
                "userName='" + userName + '\'' +
                ", userAge=" + userAge +
                ", email='" + email + '\'' +
                ", isKorean=" + isKorean +
                '}';
    }
}
