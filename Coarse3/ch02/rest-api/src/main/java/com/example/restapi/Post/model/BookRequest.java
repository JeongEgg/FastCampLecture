package com.example.restapi.Post.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 해당 클래스의 메서드를 자동으로 만들어줌
@AllArgsConstructor // 추가되는 변수에 대해 전체 파라미터를 가지는 생성자를 만들어줌
@NoArgsConstructor // 디폴트 생성자를 만들어줌
public class BookRequest {

    private String name;
    private String number;
    private String category;
}
