package kotlin_in_action.chapter_04.counting_set

class CountingSet<T>(val innerSet: MutableCollection<T> = HashSet<T>()) :
        // MutableCollection의 구현을 innerSet에게 위임한다.
        MutableCollection<T> by innerSet {
    var objectsAdded = 0

    override fun add(element: T): Boolean {
        objectsAdded++
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}

fun main(args: Array<String>) {
    var cset = CountingSet<Int>()
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}