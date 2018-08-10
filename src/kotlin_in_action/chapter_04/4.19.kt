package kotlin_in_action.chapter_04

class Client(val name: String, val postalCode: Int) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is Client)      // is 검사는 Java의 instanceof와 같다.
            return false

        return name == other.name && postalCode == other.postalCode
    }

    override fun toString(): String = "Client(name=$name, postalCode=$postalCode"

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }
}