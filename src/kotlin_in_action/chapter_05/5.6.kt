package kotlin_in_action.chapter_05_06

import kotlin_in_action.chapter_05_03.Person

fun main(args: Array<String>) {
    val people = listOf(Person("이몽룡", 29), Person("성춘향", 31))

    // 이름 붙인 인자를 사용해 람다 넘기기
    val names = people.joinToString(" ", transform = { p:Person -> p.name })
    println(names)

    // 람다를 괄호 밖에 전달하기
    people.joinToString(" ") { p:Person -> p.name }




    // 파라미터 타입을 명시
    people.maxBy { p:Person -> p.age }

    // 파라미터 타입을 생략(컴파일러가 추론)
    people.maxBy { p -> p.age }

    // 디폴트 파라미터 이름 it 사용하기
    people.maxBy { it.age }
}

