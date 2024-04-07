package org.delivery.api.common.exception;

import org.delivery.api.common.error.ErrorCodeIfs;

public interface ApiExceptionIfs {

    ErrorCodeIfs getErrorCodeIfs();
    String getErrorDescription();
    // 커스텀한 예외처리를 하려는 경우, 반드시 위의 메서드를 오버라이딩하여 정의함.
}
