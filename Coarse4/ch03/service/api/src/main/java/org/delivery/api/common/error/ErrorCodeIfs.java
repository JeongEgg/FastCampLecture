package org.delivery.api.common.error;

public interface ErrorCodeIfs {

    Integer getHttpStatusCode();

    Integer getErrorCode();

    String getDescription();

    // enum 클래스의 경우 상속을 받을 수 없기에, 인터페이스를 만든다.
    // 인터페이스에서 정의한 메서드들을 이용하여 enum 클래스의 데이터를 다룰 수 있다.
}
