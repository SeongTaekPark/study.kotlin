package kotlin_in_action.chapter_05_10

// 함수 파라미터를 람다안에서 사용하기
fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach { println("$prefix $it") }     // 각 원소에 대해 수행할 작업을 람다로 받는다.
}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")

    printMessageWithPrefix(errors, "Error:")
}

