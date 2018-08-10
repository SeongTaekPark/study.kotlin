package kotlin_in_action.chapter_04.Copy

class Client(val name: String, val postalCode: Int) {

    fun copy(name: String = this.name, postalCode: Int = this.postalCode) =
            Client(name, postalCode)
}

fun main(args: Array<String>) {
    val lee = Client("박성택", 12944)
    println(lee.copy(postalCode = 4000))
}