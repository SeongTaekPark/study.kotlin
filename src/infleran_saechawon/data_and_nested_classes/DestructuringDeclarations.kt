package infleran_saechawon.data_and_nested_classes.test2


/**
 * Destructuring declarations
 */

fun main(args: Array<String>) {
    // destructuring declarations  --> Data 클래스를 만들면 컴파일러가 componentN 함수를 만들어주기 때문.
    val(name, age) = User("kotlin", 111)
    println("$name, $age")
}

/**
 * Data 클래스 선언.
 */
data class User(var name: String, var age: Int)