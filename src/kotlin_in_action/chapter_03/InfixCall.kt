package kotlin_in_action.chapter_03

/**
 * 중위 호출(Infix call)
 *
 * 1.to("one")   -> to 메소드를 일반적인 방식으로 호출함.
 * 1 to "one"    -> to 메소드를 중위 호출 방식으로 호출함.
 */
fun main(args: Array<String>) {
    val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    println(map)
}