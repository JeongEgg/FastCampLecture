package org.example.ex07

// 코틀린에서는 스프링의 데이터에 대한 어노테이션 기능을 기본적으로 제공함.
data class User (
    var name: String?=null, // elvise 연산자 ?가 붙은 경우에는 null이 넘어올 수 있고, 없는 경우에는 null 이 넘어올 수 없다.
    var age: Int?=null,
    var email: String?=null,
){

//    override fun toString(): String {
//        return "User(name=$name, age=$age, email=$email)"
//    }
}