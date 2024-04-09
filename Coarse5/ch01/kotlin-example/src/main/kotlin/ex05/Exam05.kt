package org.example.ex05

import java.util.function.Predicate


fun main(){
    var numberList = listOf<Int>(1,2,3,4,5)

    var pred = Predicate<Int> { t -> t%2 == 0 }

    numberList.stream().filter(pred)

    val add = { x: Int, y: Int -> x+y }

    var _add = fun(x:Int, y:Int): Int{
        return x+y
    }

    println(add(2,3))
    println(_add(3,4))

    lambda(4,5,_add)

//    numberList.filter { pred }
}

fun lambda(x:Int, y:Int, method: (Int,Int) -> Int){
    println(method(x,y))
}