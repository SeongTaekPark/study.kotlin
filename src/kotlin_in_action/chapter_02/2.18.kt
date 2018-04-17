package kotlin_in_action.chapter_02

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

/**
 * 스마트 캐스트: 타입 검사와 타입 캐스트를 조합.
 */
fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }


fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: ${left} + ${right}")
                left + right
            }

            else -> throw IllegalArgumentException("Unknown expression")
        }


fun main(args: Array<String>) {
//    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}