package infleran_saechawon.data_and_nested_classes

class Outer {
    private val bar: Int = 1

    class Nested {
        fun foo() = 2
    }

    // 클래스에 inner 를 표기하면 바깥쪽 클래스의 멤버에 접근할 수 있음.
    inner class Inner {
        fun foo() = bar
    }
}

// Nested 클래스는 Outer 클래스의 bar 에 접근할 수 없음
var demo = Outer.Nested().foo()


// Inner 클래스는 바깥쪽 클래스의 멤버에 접근할 수 있음.
var demo_ = Outer().Inner().foo()

