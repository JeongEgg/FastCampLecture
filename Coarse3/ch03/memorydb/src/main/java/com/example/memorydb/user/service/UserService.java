package com.example.memorydb.user.service;

import com.example.memorydb.user.db.UserRepository;
import com.example.memorydb.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
//@RequiredArgsConstructor
public class UserService {
    // @Service : 단순히 service를 처리하는 클래스라는 의미를 부여하는 어노테이션.
    // @RequiredArgsContructor : UserRepository를 스프링으로부터 주입받기 위한 어노테이션.
    // config 패키지에서 @Configuration에 의해 생성된 UserRepository bean을 여기에 주입시켜주는 어노테이션이다.
    @Autowired // @Autowired : 스프링이 가진 bean context에 있는 여러 객체들 중에서 UserRepository 객체를 여기에 주입시켜준다.
    private UserRepository userRepository;


    // 스프링이 UserRepository를 자동으로 찾아주어야 하는데, bean 등록되어 있지 않기 때문에 찾을 수 없다.
    // bean으로 등록시키기 위해, config를 만든다.
    public UserEntity save(UserEntity user){
        return userRepository.save(user);
    }

    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public void delete(Long id){
        userRepository.delete(id);
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public List<UserEntity> filterScore(int score){
        return userRepository.findAllScoreGreaterThen(score);
    }
}
