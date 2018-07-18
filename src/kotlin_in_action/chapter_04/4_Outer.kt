package ch04.Outer

class Outer {
    inner class Inner {
        fun getOutterReference(): Outer = this@Outer
    }
}

