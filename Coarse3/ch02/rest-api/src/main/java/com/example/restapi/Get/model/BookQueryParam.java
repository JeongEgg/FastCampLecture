package com.example.restapi.Get.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 롬복을 사용하는 어노테이션
@AllArgsConstructor // 4개의 변수를 다 받는 생성자가 자동으로 만들어짐.
@NoArgsConstructor // 아무 변수도 받지 않는 디폴트 생성자가 만들어짐.
public class BookQueryParam {
    // 프로젝트 창 왼쪽의 'Structure'를 확인하면 해당 클래스에 대해 생성된 메서드를 알 수 있음.
    // lombok(@Data 어노테이션)에 의해 생성자 및 get,set 메서드 등이 이미 만들어져 있음.
    private String category;
    private String issuedYear;
    private String issuedMonth;
    private String issuedDay;
}
