package src

// Java 플랫폼에서 숫자형은 JVM primitive type 으로 저장됨
// Nullable이나 제네릭의 경우에는 박싱됨
// 박싱된 경우 identify를 유지 하지 않음

fun test() {
    var a: Int = 10000
    var b: Int? = 10000
    println("a === b: ${a === b}")
    println("a == b: ${a == b}")
}

fun main(args: Array<String>) {
    test()
}