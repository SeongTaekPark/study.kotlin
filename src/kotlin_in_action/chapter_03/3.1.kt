package kotlin_in_action.chapter_03

fun <T> joinToString (
        collection: Collection<T>,
        separator: String = ",",        // 디폴트 값이 지정된 파라미터들.
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, separator = ";", prefix = "(", postfix = ")"))   // 전달하는 인자 중 일부(또는 전부)의 이름을 명시할 수 있다.
    println(joinToString(list))  // 일부 생략 가능.
}