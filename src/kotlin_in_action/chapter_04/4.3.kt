package kotlin_in_action.chapter_04

interface Clickable {
    fun click()             // 일반 메소드 선언
    fun showOff() = println("I'm clickable!")               // 디폴트 구현이 있는 메소드
}

/**
 * showOff() 동일한 메소드를 구현하는 다른 인터페이스 정의.
 */
interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"}")
    fun showOff() = println("I'm focusable!")
}

class Button: Clickable, Focusable {
    override fun click() {
        println("I was clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()
    }
}

fun main(args: Array<String>) {
    val button = Button()
    button.showOff()
    button.setFocus(true)
    button.click()
}