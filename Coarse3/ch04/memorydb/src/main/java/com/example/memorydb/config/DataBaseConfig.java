package com.example.memorydb.config;

import com.example.memorydb.user.db.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class DataBaseConfig {
//    // @Configuration : 스프링이 실행될 때, 해당 어노테이션이 붙은 내용을 찾아서,
//    // Spring Context 영역에 생성자를 통해 객체를 만듬.
//    // service, controller, 각각의 bean으로 만들어진 영역에서 Spirng Context에 생성된 객체들이 필요할 때
//    // 주입시켜주는 기능을 한다.
//
//    @Bean // UserRepository 객체는 bean으로 만들어지면서, 스프링에 의해 관리된다.
//    public UserRepository userRepository(){
//        return new UserRepository();
//    }
//}
