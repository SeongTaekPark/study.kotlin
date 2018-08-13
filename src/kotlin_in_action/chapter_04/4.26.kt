package kotlin_in_action.chapter_04_26

class User private constructor(val nickname: String) {      // 주 생성자를 비공개로 만든다.
    companion object {      // 동반 객체를 선언
        fun newSubscribingUser(email: String) =
                User(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) =
                User(getFacebookName(accountId))
    }
}

fun getFacebookName(accountId: Int) : String = "facebook Name"

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("taekme@naver.com")
    val facebookUser = User.newFacebookUser(1)

    println(subscribingUser.nickname)
    println(facebookUser.nickname)
}

