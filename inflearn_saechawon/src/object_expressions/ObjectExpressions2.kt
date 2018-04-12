package src.object_expressions


// 객체 표현식.
fun main(args: Array<String>) {
    val data = object {
        var x = 1
        var y = 1
    }

    println("${data.x}, ${data.y}")
}
