package org.example.ex08

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun main(){
    Exam08(Store())

    var now = LocalDateTime.now()
    println(DateTimeUtil().localDateTimeToString(now))
}

data class Store(
    var registerAt: LocalDateTime ?= null
)

class Exam08(store: Store){
//    constructor(store: Store){ // 자바와 유사한 초기화 방식.
//        val strLocalDateTime = toLocalDateTimetString(store.registerAt)
//        println(strLocalDateTime)
//    }
    init { // 코틀린에서의 초기화 방식
        val strLocalDateTime = toLocalDateTimetString(store.registerAt)
        println(strLocalDateTime)
    }

    fun toLocalDateTimetString(
        localDateTime: LocalDateTime?
    ): String{
//        var temp = if (localDateTime == null){
//            LocalDateTime.now()
//        }{
//            localDateTime
//        }
//        var temp = localDateTime ?: LocalDateTime.now()
//        return localDateTime?.format(DateTimeFormatter.ofPattern("yyyy MM dd"))
        return (localDateTime ?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern("yyyy MM dd"))
    }
}

class DateTimeUtil {
    private val KST_FORMAT = "yyyy년 MM월 dd일 HH시 mm분 ss초"

    fun localDateTimeToString(
        localDateTime: LocalDateTime? = LocalDateTime.now(),
        pattern: String?= KST_FORMAT
    ): String {
        return (localDateTime?: LocalDateTime.now()).format(DateTimeFormatter.ofPattern(pattern))
    }
}