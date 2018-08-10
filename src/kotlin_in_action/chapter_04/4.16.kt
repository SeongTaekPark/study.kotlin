package kotlin_in_action.chapter_04

class LengthCounter {
    var counter: Int = 0
        private set         // 세터의 가시성을 private으로 지정한다.

    fun addWord(word: String) {
        counter += word.length
    }
}

fun main(args: Array<String>) {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("Hi")
    println(lengthCounter.counter)
//    lengthCounter.counter = 0;      // 이렇게 외부에서 값을 변경하지 못함.
}