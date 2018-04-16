package infleran_saechawon.data_and_nested_classes

fun main(args: Array<String>) {
//    var obj = User("Kotlin", 113)
    println(User_())
    println(User_("Test!!!", 23123))
    println(User_(age = 777))           // age 값만 설정.
}

// 데이터 클래스
data class User(var name: String, var age: Int)

// 기본 생성자에 기본값을 설정.
data class User_(var name: String = "Kotlin!!!", var age: Int = 113)
