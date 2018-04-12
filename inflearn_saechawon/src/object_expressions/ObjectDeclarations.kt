package src.object_expressions

// 객체 선언 문법
// - object 키워드 뒤에 항상 이름이 있어야 함
// - object declaration 은 object expression 이 아님
// - 그래서 할당 구문의 우측에 사용될 수가 없음.
// - 슈퍼 타입을 가질 수 있음 (상속가능)
// - object declaration 는 나중에 초기화 된다. (최초 접근 시)


object CountManager {
    var count = 0
}


fun main(args: Array<String>) {
    CountManager.count++          // object 의 이름으로 바로 접근이 가능함.
    println(CountManager.count)
    CountManager.count++          // object 의 이름으로 바로 접근이 가능함.
    println(CountManager.count)
    CountManager.count++          // object 의 이름으로 바로 접근이 가능함.
    println(CountManager.count)
}