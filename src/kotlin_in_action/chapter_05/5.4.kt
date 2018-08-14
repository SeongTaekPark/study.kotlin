package kotlin_in_action.chapter_05_04

import kotlin_in_action.chapter_05_03.Person

fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))

    // 람다를 사용해 컬렉션 검색하기
    println(people.maxBy { it.age })


    // 멤버 참조를 사용해 컬렉션 검색하기
    println(people.maxBy(Person::age))
}