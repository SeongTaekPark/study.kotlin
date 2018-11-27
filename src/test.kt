
fun main(args: Array<String>) {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.filter { it.age == people.maxBy(Person::age)!!.age })
}



data class Person(val name: String, val age: Int)


