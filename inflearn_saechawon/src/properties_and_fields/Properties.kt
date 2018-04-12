package src.properties_and_fields

// Properties

fun main(args: Array<String>) {
    var obj = Address()
    println(obj.name)
}

class Address {
    var name: String = "Kotlin"
        // Custom accessors (getter, setter) 재정의.
        get() {
            return field + "!!!"
        }
        set(value) { field = value }
}