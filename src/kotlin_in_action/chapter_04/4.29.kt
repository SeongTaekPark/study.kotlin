package kotlin_in_action.chapter_04_29

// 동반 객체에 대한 확장 함수 선언하기.


class Person(val firstName: String, val lastName: String) {
    companion object {          // 비어있는 동반객체를 선언한다.
    }
}

// Person 클래스 밖에서 동반 객체에 대한 확장 함수 선언.
fun Person.Companion.fromJSON(json: String): Person = Person("", "")

fun main(args: Array<String>) {
    val p = Person.fromJSON("")
}








