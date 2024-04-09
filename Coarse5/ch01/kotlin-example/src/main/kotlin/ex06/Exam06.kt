package org.example.ex06

fun main() {
    val dog = Dog("해피")

    println(dog.age)
    dog.age = 20
    println(dog.age)

    dog.eat()
    dog.bark()
}

interface Bark {
    fun bark()
}

interface Temp {
    fun hi()
}

abstract class Animal(
    private val name: String?="", // 생성자 메서드를 따로 구현하지 않음.

) : Bark {
    // body
    fun eat(){
        println("$name 식사시작 합니다.")
    }
}

class Dog(
    private val name: String?=null,
    var age: Int?=0, // 값을 선언하지 않으면 null이 됨.
) : Animal(name), Temp{ // 상속받음. 생성자 메서드(Dog)의 파라미터를 부모 클래스(Animal)에 super로 넘겨줌.

    var _age: Int?=0
//        get() = field
//        set(value) { field = value } // 의미 없음. 코틀린에서는 getter, setter 를 자동으로 만들어줌.

    override fun bark(){
        println("$name : 멍멍")
    }

    override fun hi() {
        println("hi")
    }
}

