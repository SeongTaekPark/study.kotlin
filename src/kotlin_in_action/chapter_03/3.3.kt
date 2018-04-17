package kotlin_in_action.chapter_03

/**
 * 확장 함수로 유틸리티 함수 정의.
 */
fun <T> Collection<T>.joinToString(
        separator: String = ",",        // 디폴트 값이 지정된 파라미터들.
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {        // "this" 는 수신 객체를 가리킨다. 여기서는 T 타입의 원소로 이뤄진 컬렉션이다.
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = arrayListOf(1, 2, 3)
    println(list.joinToString(" "))
}