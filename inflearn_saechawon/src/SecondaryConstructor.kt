package src

// 보조 생성자.
class Person(val name: String) {
    constructor(name: String, parent: Person) : this(name) {

    }

    constructor() : this("홍길동", Person()) {

    }
}