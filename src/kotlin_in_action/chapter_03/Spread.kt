package kotlin_in_action.chapter_03

/**
 * 스프레드(spread) 연산자.
 */
fun main(args: Array<String>) {
    val list = listOf("args: ", *args)          // * 는 스프레드 연산자.
    println(list)
}