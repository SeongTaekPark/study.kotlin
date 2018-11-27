package kotlin_in_action.chapter_04

/**
 * 내부 클래스를 선언(inner class) -> 바깥쪽 클래스의 인스턴스를 참조 가능
 */
class Outer {
    inner class Inner {
        fun getOuterReference(): Outer = this@Outer     // 'this@Outer' -> 내부 클래스 안에서 바깥쪽 클래스 outer의 참조에 접근
    }
}