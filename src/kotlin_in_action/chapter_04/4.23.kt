package kotlin_in_action.chapter_04

import java.io.File

// 객체 선언도 클래스나 인스턴스를 상속할 수 있다.
object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

fun main(args: Array<String>) {
    println(CaseInsensitiveFileComparator.compare(File("/User"), File("/user")))

    val files = listOf<File>(File("/Z"), File("/a"))
    println(files.sortedWith(CaseInsensitiveFileComparator))
}