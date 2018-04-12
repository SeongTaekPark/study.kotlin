package src.object_expressions


fun main(args: Array<String>) {
    // 객체 표현식으로 Thread 에 객체 전달.
    val t = Thread(object : Runnable {
        override fun run() {
            println("hello kotlin")
        }
    })

    // 람다
//    val t = Thread({ println("hello kotlin") })
    t.run()
}