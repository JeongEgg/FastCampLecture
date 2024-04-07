package org.example.ex02

import java.util.*

fun main(){
    val a:Int = 0
    val b = 10
    val c: Int = 20
    val d: Int? = null

    callFunction(a)
    callFunction(b)
    callFunction(c)
    callFunction(d) // null 을 출력해준다.
    callFunction()
//    Optional.ofNullable(d).ifPresent{it -> println(it) }
}

// ? : 엘비스 연산자(null일수도 있다)
// 변수? << 변수가 null인가?
// 변수?. << 변수가 null이 아닐 때
// 변수?: << 변수가 null일 때
fun callFunction(i: Int? = 100){ // 넘어오는 값이 없으면 디폴트 값 100으로 설정.

    // 1
//    i?.let {
//        println(it)
//    }?: run {
//        println("null 값 입니다.")
//    }

    // 2
//    val temp = if(i==null) "null 값 입니다" else i
//    println(temp)

    // 3
    val temp = i ?: "null 값 입니다"
    println(temp)

    // 4
    val temp2 = i?.let { it * 20 } ?: "null 값 입니다"
    println(temp2)
}