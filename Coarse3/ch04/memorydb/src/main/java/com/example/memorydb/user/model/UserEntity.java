package com.example.memorydb.user.model;

import com.example.memorydb.entity.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserEntity extends Entity {
    // UserEntity : 데이터베이스 저장될 데이터를 다루는 클래스이기 때문에 Entity를 상속받는다.
    private String name;
    private int score;
}
