package com.example.memorydb.user.db;

import com.example.memorydb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    /** jpa Query Method */
    // select * from user where score >= ?
    public List<UserEntity> findAllByScoreGreaterThanEqual(int sc);

    // select * from user where score >= ? AND score <= ?
    List<UserEntity> findAllByScoreGreaterThanEqualAndScoreLessThanEqual(int min, int max);

    @Query(
        "select u from user u where u.score >= ?1 AND u.score <= ?2"
    )
    List<UserEntity> score(int min, int max);

    @Query(
            value = "select * from user as u where u.score >= ?1 AND u.score <= ?2",
            nativeQuery = true
    )
    List<UserEntity> score2(int min, int max);

    @Query(
            value = "select * from user as u where u.score >= :min AND u.score <= :max",
            nativeQuery = true
    )
    List<UserEntity> score3(
            @Param(value = "min") int min,
            @Param(value = "max") int max);
}
