package kotlin_in_action.chapter_04_28

interface JSONFactory<T> {
    fun fromJSON(jsonText: String): T
}

class Person(val name: String) {
    companion object : JSONFactory<Person> {        // 동반 객체가 인터페이스를 구현한다.
        override fun fromJSON(jsonText: String): Person = Person("")
    }
}

