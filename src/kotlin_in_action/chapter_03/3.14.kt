package kotlin_in_action.chapter_03

class User(val id: Int, val name: String, val address: String)

/**
 * 검증 로직을 확장 함수로 추출하기.
 */
fun User.validateBeforeSave() {
    /**
     * 한 필드를 검증하는 로컬 함수를 정의한다.
     */
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user $id: empty $fieldName")
        }
    }

    validate(name, "Name")
    validate(address, "address")
}

fun saveUser(user: User) {
    user.validateBeforeSave()           // 확장 함수를 호출한다.

    // user를 데이터베이스에 저장한다.
}

fun main(args: Array<String>) {
    saveUser(User(1, "", ""))
}

