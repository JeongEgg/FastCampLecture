package com.example.simpleboard.board.db;

import com.example.simpleboard.post.db.PostEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Entity(name = "board")
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String boardName;
    private String status;

    // DB를 객체지향적으로 컨트롤
    // @OneToMany : 1:N
    @OneToMany(
            mappedBy = "board"
    )
    private List<PostEntity> postList = List.of();
}
