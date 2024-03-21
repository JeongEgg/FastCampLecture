package com.example.restapi.Put.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class UserRequestPut {
    private String userName;
    private Integer userAge;
    private String email;
//    private boolean isKorean;
    private Boolean isKorean;
}
/* put 요청에 의해 isKorean의 값을 true가 아닌 false 값으로 받게 된다.
 *  structure를 확인해보면
 *  앞의 'is'라는 명명은 boolean을 의미하기 때문에 set 메서드가
 *  'setIsKorean'이 아닌 'setKorean'으로 생성되어 있음을 확인할 수 있다.
 *  따라서 isKorean이라는 변수를 찾지 못했고, primitive 타입의 boolean이 디폴트 값인 false를 반환한다.
 *  put 요청을 할 때, 'is_korean'이 아닌, 'korean'이라는 변수명으로 전송하면 정상적으로 처리할 수 있지만,
 *  json에 전달하고자 하는 정확한 의미를 전달하기 어렵다. 값을 사용하는 사람이 의미 전달에 대해 혼동이 생길 수 있다.
 *  두번째 문제는 json의 내용이 없다면, null 값으로 받아야 하는데, false값으로 받게 되는 문제가 있다.
 *  boolean(primitive 타입)이 아닌 Boolean(reference 타입)을 사용하여야 한다.
 *  reference 타입을 사용하면, set 메서드를 자동으로 setIsKorean으로 만들어준다.
 * */