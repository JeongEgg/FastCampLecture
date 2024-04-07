package org.delivery.api.account;

import lombok.RequiredArgsConstructor;
import org.delivery.api.account.model.AccountMeResponse;
import org.delivery.api.common.api.Api;
//import org.delivery.api.common.error.ErrorCode;
//import org.delivery.api.common.error.UserErrorCode;
//import org.delivery.api.common.exception.ApiException;
import org.delivery.api.common.error.ErrorCode;
import org.delivery.api.common.error.UserErrorCode;
import org.delivery.api.common.exception.ApiException;
import org.delivery.db.account.AccountEntity;
import org.delivery.db.account.AccountRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final AccountRepository accountRepository;

    // 3
    @GetMapping("/me")
    public Api<AccountMeResponse> me(){

        var response = AccountMeResponse.builder()
                .name("홍길동")
                .email("A@gmail.com")
                .registeredAt(LocalDateTime.now())
                .build();

        var str = "안녕하세요";
        var age = 0;
        try {
            Integer.parseInt(str); // 예외 발생
        }catch (Exception e){
            throw new ApiException(ErrorCode.SERVER_ERROR,e,"사용자 Me 호출시 에러 발생");
        }

        return Api.OK(response);
    }
    // 2
//    @GetMapping("/me")
//    public Api<Object> me(){
//
//        var response = AccountMeResponse.builder()
//                .name("홍길동")
//                .email("A@gmail.com")
//                .registeredAt(LocalDateTime.now())
//                .build();
//
//        return Api.ERROR(UserErrorCode.USER_NOT_FOUND,"홍길동이라는 사용자 없음");
//    }

    // 1
//    @GetMapping("/me")
//    public Api<AccountMeResponse> me(){
//
//        var response = AccountMeResponse.builder()
//            .name("홍길동")
//            .email("A@gmail.com")
//            .registeredAt(LocalDateTime.now())
//            .build();
//
//        return Api.OK(response);
//    }
}
