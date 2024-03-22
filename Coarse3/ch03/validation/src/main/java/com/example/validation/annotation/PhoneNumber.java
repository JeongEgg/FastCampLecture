package com.example.validation.annotation;

import com.example.validation.validator.PhoneNumberValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = {PhoneNumberValidator.class}) // 어떠한 클래스로 검증할 것인지에 대한 설정.
@Target({ElementType.FIELD}) // 변수에만 사용?
@Retention(RetentionPolicy.RUNTIME) // 언제 실행할 것인지에 대한 어노테이션
public @interface PhoneNumber {
    String message() default "핸드폰 번호 양식에 맞지 않습니다 ex) 010-0000-0000";
    String regexp() default "^\\d{2,3}-\\d{3,4}-\\d{4}$";

    Class<?>[] groups() default { };
    Class<? extends Payload>[] payload() default { };
}
