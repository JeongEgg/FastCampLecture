package com.example.validation.model;

import com.example.validation.annotation.PhoneNumber;
import com.example.validation.annotation.YearMonth;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonNaming(value = PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserRegisterRequest {

    // 어노테이션을 사용하여 validation을 검증함.

//    @NotBlank // (name != null) && (name != "") && (name != "  ")
    private String name;

    private String nickName;

    @Size(min = 1, max = 12)
    @NotBlank
    private String password;

    @NotNull
    @Min(1)
    @Max(100) // 최솟값, 최댓값
    private Integer age;

    @Email // 이메일 포맷
    private String email;

    @PhoneNumber // 휴대폰 번호를 검증하는 커스터마이징한 어노테이션
//    @Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}$",message = "휴대폰 양식에 맞지 않습니다.")
    private String phoneNumber;

    @FutureOrPresent // 현재 또는 미래의 날짜
    private LocalDateTime registerAt;

    @YearMonth(pattern = "yyyy-MM")
    private String birthdayYearMonth;

    @AssertTrue(message = "name or nickName 은 존재해야 합니다.")
    public boolean isNameCheck(){
        if (Objects.nonNull(name) && !name.isBlank()){
            return true;
        }
        if (Objects.nonNull(nickName) && !nickName.isBlank()){
            return true;
        }
        return false;
    }
}
