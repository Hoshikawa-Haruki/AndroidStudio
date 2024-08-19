package com.example.androidkotlin

fun main() {
    var list = listOf<Int>(10, 20, 30)
    println(list.size) // 3 출력
    println(list.get(0)) // 10 출력
    println(list[1]) // 20 출력

    var mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(40) // 40 추가
    mutableList.add(4, 50) // 4번째 인덱스에 50 추가
    mutableList.set(3, 100) // 3번째 인덱스를 100으로 변경
    println(mutableList) // [10, 20, 30, 100, 50] 출력
    println(mutableList.size) // 5 출력

    var map = mapOf<String, String>(Pair("one", "1"), Pair("two", "2"), Pair("three", "3"))
    println(map) // {one=1, two=2, three=3} 출력
    println(map.size) // 3 출력
}

