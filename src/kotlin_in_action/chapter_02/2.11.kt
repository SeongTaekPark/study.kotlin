package kotlin_in_action.chapter_02

/**
 * enum 클래스 정의.
 */
enum class Color (val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0), ORANGE(255,165,0),
    YELLOW(255, 255, 0), GREEN(0, 255, 0), BLUE(0, 0, 255),
    INDIGO(75, 0, 130), VIOLET(238, 130, 238);              // 여기 반드시 세미콜론을 사용해야 한다.

    /**
     * enum 클래스 안에서 메소드를 정의한다.
     */
    fun rgb() = (r * 256 + g) * 256 + b
}

fun main(args: Array<String>) {
    println(Color.BLUE.rgb())
}