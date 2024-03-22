package com.example.memorydb.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

public abstract class Entity implements PrimaryKey{
    // primaryKey를 구현하기 위한 추상클래스.
    @Getter
    @Setter
    private Long id;
}
