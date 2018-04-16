package kotlin_in_action.chapter_02

import kotlin_in_action.chapter_02.Color.*
import java.lang.Exception

/**
 * when의 분기 조건은 임의의 객체를 허용한다.
 */
fun mix(c1: Color, c2: Color) =
        when(setOf(c1, c2)) {       // 코틀린은 전달받은 여러 객체를 그 객체들을 포함하는 집합인 Set 객체로 만드는 setOf 함수를 제공.
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }

fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
}