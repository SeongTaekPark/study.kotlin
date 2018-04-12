package src.object_expressions.test2

// - object declaration 는 나중에 초기화 된다. (최초 접근 시)

object MyClass1 {
}

object MyClass2 {
}

object MyClass3 {
}


fun main(args: Array<String>) {
    println(1)
    println(MyClass1)
    println(2)
    println(MyClass2)
    println(3)
    println(MyClass3)
    println(4)
}

