package com.example.memorydb.user.controller;

import com.example.memorydb.user.model.UserEntity;
import com.example.memorydb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    //@RequiredArgsContructor : UserService를 스프링으로부터 주입받기 위한 어노테이션
    private final UserService userService;

    // @PutMapping : POST 요청을 받을 때, Update 또는 Create를 실행할 것이기 때문에, PutMapping 어노테이션을 사용한다.
    @PutMapping("")// create, update
    public UserEntity create(
            @RequestBody UserEntity userEntity
    ){
        return userService.save(userEntity);
    }

    @GetMapping("/all")
    public List<UserEntity> findAll(){
        return userService.findAll();
    }

    @DeleteMapping("/id/{id}")
    public void delete(
            @PathVariable Long id
    ){
//        userService.delete(id);
    }

    @GetMapping("/id/{id}")
    public UserEntity findOne(
            @PathVariable Long id
    ){
         var response = userService.findById(id);
         return response.get();
    }

    @GetMapping("/score")
    public List<UserEntity> filterScore(
            @RequestParam int score
    ){
        return userService.filterScore(score);
    }

    @GetMapping("/min_max")
    public List<UserEntity> filterScore(
            @RequestParam int min,
            @RequestParam int max
    ){
        return userService.filterScore(min,max);
    }

    @GetMapping("/min_max2")
    public List<UserEntity> filterScore2(
            @RequestParam int min,
            @RequestParam int max
    ){
        return userService.filterScore2(min,max);
    }
}
