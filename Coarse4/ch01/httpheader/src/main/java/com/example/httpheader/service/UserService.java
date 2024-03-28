package com.example.httpheader.service;

import com.example.httpheader.db.UserRepository;
import com.example.httpheader.model.LoginRequest;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public String login(
            LoginRequest loginRequest,
            HttpServletResponse httpServletResponse
    ){
        var id = loginRequest.getId();
        var pw = loginRequest.getPassword();

        var optionalUser = userRepository.findByName(id);

        if (optionalUser.isPresent()){
            var userDto = optionalUser.get();
            if (userDto.getPassword().equals(pw)){
                return userDto.getId();
            }
        }else {
            throw new RuntimeException("User Not Found");
        }
        return null;
    }

}
