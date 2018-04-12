

fun main(args: Array<String>) {
    var obj = Address()
    println(obj.isEmpty)
}

// Backing field
class Address {
    val isEmpty: Boolean = false
        get() { return field }
}