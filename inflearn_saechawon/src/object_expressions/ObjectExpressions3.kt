package src.object_expressions


class MyClass {
    public fun publicFun() = object {
        var x = 111
    }

    private fun privateFun() = object {
        var x = 111
    }

    fun print() {
//        println(publicFun().x)          // 익명객체가 public function 이나 public property 에서 리턴 되는 경우, 익명객체의 슈퍼타입으로 동작됨 이런 경우 객체에 추가된 멤버에 접근이 불가능함.
        println(privateFun().x)
    }
}

fun main(args: Array<String>) {
    MyClass().print()
}