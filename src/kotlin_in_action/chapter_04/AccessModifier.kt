package kotlin_in_action.chapter_04

internal open class TalkativeButton : Focusable {
    private fun yell() = println("hey!")
    protected fun whisper() = println("Let's talk")
}

//fun TalkativeButton.giveSpeech() {      // 오류: public 멤버가 자신의 "internal" 수신 타입인 "TalkativeButton"을 노출 함
//    yell();             // 오류: 'yell'에 접근할 수 없음. 'yell'은 TalkativeButton 의 private 멤버임.
//    whisper();          // 오류: 'whisper'에 접근할 수 없음. 'whisper'는 TalkativeButton 의 protected 멤버임.
//}

/**
 * giveSpeech 확장함수의 가시성을 internal 로 변경하면 해결.
 */
internal fun TalkativeButton.giveSpeech() {
//    yell();
//    whisper();  // 코틀린에서 protected 멤버는 오직 어떤 클래스나 그 클래스를 상속한 클래스 안에서만 보인다.
}