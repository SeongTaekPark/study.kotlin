package kotlin_in_action.chapter_02

import kotlin_in_action.chapter_02.Color.*      // 상수까지 모두 임포트.


/**
 * enum 상수 값을 임포트해서 enum 클래스 수식자 없이 enum 사용하기.
 */
fun getWarmth(color: Color) = when(color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(RED))
}