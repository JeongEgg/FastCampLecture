package org.delivery.api.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum ErrorCode implements ErrorCodeIfs {

    OK(200 , 200 , "성공"),
    BAD_REQUEST(HttpStatus.BAD_REQUEST.value(), 400, "잘못된 요청"),

    SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR.value(), 500, "서버에러"),

    NULL_POINT(HttpStatus.INTERNAL_SERVER_ERROR.value(), 512, "Null point")

    ;

    // enum 클래스의 값들은 변경되지 않아야 하기 때문에 final로 선언한다.
    private final Integer httpStatusCode;
    private final Integer errorCode;
    private final String description;
}
