package org.example.ex03

import java.util.*

fun main(){
    // 가변 var, 불변 val
    // mutable, immutable
    var userList = mutableListOf<User>()
    userList.add(User("1",10))
    userList.add(User("2",20))
    userList.add(User("3",30))

    val list = listOf<User>(
        User("4",40)
    )
    /*
    * 위에서 userList는 가변이기 때문에 'add' 메서드가 존재한다.
    * list는 불변이기 때문에 'add'와 같은 메서드가 없다.
    * */

    println("예시 1")
    for (element in userList){
        println(element)
    }

    println("예시 2")
    userList.forEach{ it -> println(it) }

    println("예시 3")
    userList.forEachIndexed { index, user ->
        println("index : $index user : $user")
    }

    println("예시 4")
    userList.forEachIndexed(fun (index, user){
        println("index : $index user : $user")
    })

    println("예시 5")
    for((index,element) in userList.withIndex()){
        println("index : $index user : $element")
    }
}