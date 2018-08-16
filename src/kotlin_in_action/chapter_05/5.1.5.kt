package kotlin_in_action.chapter_05_01_05

import kotlin_in_action.chapter_05_03.Person

fun main(args: Array<String>) {
    // 생성자 참조(constructor reference)를 사용하면 클래스 생성 작업을 연기하거나 저장해둘 수 있다.
    val createPerson = ::Person     // "Person"의 인스턴스를 만드는 동작을 값으로 저장한다.

    val p = createPerson("Alice", 29)
    println(p)


    // 확장 함수도 멤버 함수와 똑같은 방식으로 참조할 수 있다.
    val predicate = Person::isAdult
}

fun Person.isAdult() = age >= 21

