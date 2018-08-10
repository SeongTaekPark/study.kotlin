package ch04.User1

open class User(val nickname: String, val isSubscribed: Boolean = true)

class TwitterUser(nickname: String) : User(nickname)

/**
 * 이클래스의 (유일한) 주 생성자는 비공개다.
 */
class Secrettive private constructor()


fun main(args: Array<String>) {
    val hyun = User("현석")
    println(hyun.isSubscribed)

    val gye = User("계영", false)
    println(gye.isSubscribed)

    val hey = User("혜원", isSubscribed = false)
    println(hey.isSubscribed)
}

