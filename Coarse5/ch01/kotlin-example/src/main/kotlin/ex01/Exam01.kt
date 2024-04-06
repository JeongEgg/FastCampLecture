package org.example.ex01

fun main(){
    // var(변할 수 있는 객체)
    // val(불변 객체, final)
    val name: String = "홍길동"
    var _name: String = "홍길동"
    val n = "홍길동"

    // 코틀린은 모든 변수가 reference 타입이다
    var i = 10
    var _i: Int = 10

    var d: Double = 20.0

    var f: Float = 10f

    var b: Boolean = true

    println("사용자의 이름은 : $name") // 출력이 간단함.
}