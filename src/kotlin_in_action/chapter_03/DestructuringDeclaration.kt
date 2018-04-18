package kotlin_in_action.chapter_03

/**
 * 구조 분해 선언(destructuring declaration)
 */
fun main(args: Array<String>) {
    val (number, name) = 1 to "one"

    println("number = $number, name = $name")
}