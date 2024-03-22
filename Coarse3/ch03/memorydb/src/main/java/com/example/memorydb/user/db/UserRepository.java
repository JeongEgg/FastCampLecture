package com.example.memorydb.user.db;

import com.example.memorydb.db.SimpleDataRepository;
import com.example.memorydb.user.model.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRepository extends SimpleDataRepository<UserEntity, Long> {
    // user 패키지만의 데이터를 저장하는 메모리 데이터베이스
    // service에서 C,R,U,D를 통해 UserRepository를 조작한다.

    /* UserService에서 스프링의 Bean Context에 들어가기 위해, @Service 어노테이션을 추가해주거나,
     * config 패키지에서와 같이 @Bean 어노테이션을 이용해 생성해줄 수 있다. 이렇게 Bean Context에
     * 객체를 생성하는 이유는, UserRepository에서 상속받는 SimpleDataRepository가 직접
     * 커스텀하여 만든 클래스이기 때문이다.*/


    /** 원하는 기능을 직접 구현해서 사용 */
    // ex) 사용자 10명을 생성 후 70점 이상의 사용자의 정보를 찾아주는 method 작성하기
    // UserEntity와 UserRepository를 그대로 이용할 것이기 때문에 메서드를 SimpleDataRepository에서 작성하지 않고, 여기서 작성한다.
    // 서비스 로직과 컨트롤러도 구현해야 함.
    public List<UserEntity> findAllScoreGreaterThen(int score){
        return this.findAll()
                .stream()
                .filter(
                        it -> {
                            return it.getScore() >= score;
                        }
                ).collect(Collectors.toList());
    }
}
