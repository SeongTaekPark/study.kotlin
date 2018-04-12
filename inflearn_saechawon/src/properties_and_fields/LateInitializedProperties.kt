package src.lateinitialized

fun main(args: Array<String>) {
    var obj = Address()
    println(obj.data)
}


/**
 * lateinit
 *
 * 클래스의 바디에서 선언된 프로퍼티만 가능.
 * 기본생성자에서 선언된 프로퍼티는 안 됨.
 * var 프로퍼티만 가능.
 * custom accessor이 없어야 함.
 * non-null 타입이여야 함.
 * 프리미티브 타입이면 안됨
 */
class Address {
    lateinit var data: String

    fun setUp() {
        data = "나중에"
    }
}