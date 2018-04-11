package src

fun main(args: Array<String>) {
    val obj = Customer("코틀린")
}

// 기본 생성자.
// 기본 생성자의 파라미터는 init 블럭 안에서만 사용가능.
class Customer(name: String) {
    init {
        print("이름: $name")
    }
}