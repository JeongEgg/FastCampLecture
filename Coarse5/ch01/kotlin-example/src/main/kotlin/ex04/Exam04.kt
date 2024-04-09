package org.example.ex04

fun main(){
    var map = mapOf<String,Any>(
        Pair("",""),
        "key" to "value"
    )
    // 자바의 Object를 코틀린에서는 Any로 표현함.

    val mutableMap = mutableMapOf<String,Any>(
        "key" to "value"
    )

    mutableMap["key"] = "value"

    val value = mutableMap["key"]

    val hashMap = hashMapOf<String, Any>()

    var triple = Triple<String, String, String>(
        first = "",
        second = "",
        third = ""
    )
}