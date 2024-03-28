package com.example.cookie.service;

import com.example.cookie.db.UserRepository;
import com.example.cookie.model.LoginRequest;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void login(
            LoginRequest loginRequest,
            HttpServletResponse httpServletResponse
    ){
        var id = loginRequest.getId();
        var pw = loginRequest.getPassword();

        // 클라이언트로부터 받는 id 값은 데이터베이스의 name 데이터를 가리킨다.
        // UserDto에서의 id는 db에서 Primary Key로 사용되는 데이터를 의미
        var optionalUser = userRepository.findByName(id);

        if (optionalUser.isPresent()){
            var userDto = optionalUser.get();
            if (userDto.getPassword().equals(pw)){
                // cookie에 해당 정보를 저장
                var cookie = new Cookie("authorization-cookie",userDto.getId());
                cookie.setDomain("localhost"); // 도메인 주소 ex) naver.com, daum.net
                cookie.setPath("/"); // 루트 경로
                cookie.setHttpOnly(true); // 클라이언트 자바스크립트에서 쿠키값을 읽지 못하도록 막음
//                cookie.setSecure(true); // https에서만 쿠키를 사용하도록 설정(http에서 사용 불가능)
                cookie.setMaxAge(-1); // expires를 session으로 설정(서버와 연결된 동안만 사용하는 설정)

                httpServletResponse.addCookie(cookie);
            }
        }else {
            throw new RuntimeException("User Not Found");
        }
    }
}
