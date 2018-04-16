package kotlin_in_action.chapter_02


/**
 * 커스텀 접근자. 프로퍼티의 접근자를 직접 생성하는 경우.
 */
class Rectangle(val height: Int, var width: Int) {
    val isSquare: Boolean
        get() = height == width
}


fun main(args: Array<String>) {
    val rectangle = Rectangle(4, 4);
    println(rectangle.isSquare)
}