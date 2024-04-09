package org.example.ex07

fun main(){
    val user = User()
    user.name = "홍길동"
    user.age = 10
    user.email = "gmail"

    val user2 = user.copy(name = "이순신")

    val user3 = User(
        age = 10,
        email = "gmail",
        name = "유관순", // 변수를 넣는 것의 순서가 없음.
    )

    val user4 = User(
        name = null, age = null, email = null
        // plugin에서 Kotlin Fill Class 설치하면 데이터를 자동으로 채워줄 수 있다.
    )

    println(user)
    println(user2)
}