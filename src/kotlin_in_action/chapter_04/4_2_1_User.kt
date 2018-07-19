package ch04.User1

class User(val nickname: String, val isSubscribed: Boolean = true)


fun main(args: Array<String>) {
    val hyun = User("현석")
    println(hyun.isSubscribed)

    val gye = User("계영", false)
    println(gye.isSubscribed)

    val hey = User("혜원", isSubscribed = false)
    println(hey.isSubscribed)
}

