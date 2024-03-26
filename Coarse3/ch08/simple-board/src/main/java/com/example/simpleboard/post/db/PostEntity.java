package com.example.simpleboard.post.db;

import com.example.simpleboard.board.db.BoardEntity;
import com.example.simpleboard.reply.db.ReplyEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "post")
public class PostEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne // N:1
    @JsonIgnore
    @ToString.Exclude
    private BoardEntity board; // board_id
//    private Long boardId;

    private String userName;
    private String password;
    private String email;
    private String status;
    private String title;
    @Column(columnDefinition = "TEXT")
    private String content;
    private LocalDateTime postedAt;
    @Transient // 해당 값을 데이터베이스에 컬럼으로 사용하지 않도록 하는 어노테이션
    private List<ReplyEntity> replyList = List.of();
}
