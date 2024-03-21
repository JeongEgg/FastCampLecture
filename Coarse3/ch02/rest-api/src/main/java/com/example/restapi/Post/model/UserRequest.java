package com.example.restapi.Post.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private String userName;
//    private int userAge;
    private Integer userAge;
    private String email;
    /* 파라미터를 받을 때, int와 같이 primitive 타입을 받는 경우,
    * 클라이언트에서 파라미터명을 잘못 설정하여 전송할 때, 0으로 출력된다.
    * 그 이유는 int 타입의 기본값이 0이기 때문이다. 0이라는 값 또한 정수이기 때문에,
    * 클라이언트측의 파라미터명 설정이 올바르게 되었는지 정확하게 확인하는 것에 문제가 될 수 있다.
    *
    * String, Integer와 같이 reference 타입을 받는 경우,
    * 클라이언트에서 파라미터명을 잘못 설정하여 전송할 떄에는 null로 출력된다.
    * 이로 인해, 클라이언트에서 전송할 때의 파라미터명 설정이 잘못되었거나 다른 문제가 있다는 것을
    * 알 수 있다.*/
}
