package inflearn_saechawon.src

fun main(args: Array<String>) {
    foo4()
}

fun foo1() {
    var ints = listOf(0, 1, 2, 3)
    ints.forEach(fun(value: Int) {
        if (value == 1) return      // return 이 포함된 함수안에서만 return 됨.
        print(value)
    })
    print("End")
}

// 람다식 안에서 return 시 nearest enclosing 함수가 return 됨.
// 람다식에 대해서만 return 하려면 label을 이용해야 함.
fun foo2() {
    var ints = listOf(0, 1, 2, 3)

    // 람다.
    ints.forEach label@ {
                if (it == 1) return@label
                print(it)
    }

    print("End")
}

// 암시적 레이블.
// 암시적 레이블은 사용된 함수의 이름과 동일함.
fun foo3() {
    var ints = listOf(0, 1, 2, 3)

    // 람다.
    ints.forEach {
        if (it == 1) return@forEach
        print(it)
    }

    print("End")
}

// 레이블 return시 값을 반환할 경우.
fun foo4(): List<String> {
    var ints = listOf(0, 1, 2, 3)
    var result = ints.map {
        if (it == 0) {
            return@map "zero"  // return at named label.
        }
        "number $it"        // expression returned from lambda
    }
    return result
}
