package kotlin_in_action.chapter_05_03

// 컬렉션을 직접 검색하기 (람다 또는 멤버 참조를 사용하지 않고)
fun findTheOldest(people: List<Person>) {
    var maxAge = 0
    var theOldest: Person? = null
    for (person in people) {
        if (person.age > maxAge) {
            maxAge = person.age
            theOldest = person
        }
    }

    println(theOldest)
}

data class Person(val name: String, val age: Int)


fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    findTheOldest(people)
}