package com.example.validation.validator;

import com.example.validation.annotation.PhoneNumber;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.regex.Pattern;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, String> {
    // 검증을 수행(구현)하는 클래스
    private String regexp;

    @Override
    public void initialize(PhoneNumber constraintAnnotation) {
        // 파라미터 초기화
        this.regexp = constraintAnnotation.regexp();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // validation 검증 구현 메서드
        boolean result = Pattern.matches(regexp,value);
        return result;
    }
}
