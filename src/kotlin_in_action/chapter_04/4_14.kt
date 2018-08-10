package chapter_04_14


interface User {
    val nickname: String            // 인터페이스에 추상 프로퍼티 선언을 넣을 수 있다.
}

class PrivateUser(override val nickname: String) : User     // 주 생성자에 있는 프로퍼티

class SubscribingUser(val email: String) : User {
    override val nickname: String
        get() = email.substringBefore('@')      //  커스텀 게터
}

class FacebookUser(val accountId: Int) : User {
    override val nickname: String = getFacebookName(accountId)      // 프로퍼티 초기화 식
}

fun getFacebookName(accountId: Int) = "@@@"


fun main(args: Array<String>) {
    println(PrivateUser("test@kotlinlang.org").nickname)
    println(SubscribingUser("test@kotlinlang.org").nickname)
}