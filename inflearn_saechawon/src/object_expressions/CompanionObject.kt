package src.object_expressions.test1

// 동반자 객체
// - 클래스 내부의 object declaration 은 companion 키워드를 붙일 수 있음.
// - companion object 의 멤버가 다른 언어의 static 멤버 처럼 보일 수 있지만 아님.
// - companion object 의 멤버는 실제 객체의 멤버임.
// - 슈퍼클래스도 가질 수 있는 클래스의 객체임.

class MyClass {
    companion object Factory {  // 이름 생략도 가능.
        fun create(): MyClass = MyClass()
    }
}

// Companion object 의 멤버는 클래스 이름을 통해서 호출할 수 있음.
val instance = MyClass.create()