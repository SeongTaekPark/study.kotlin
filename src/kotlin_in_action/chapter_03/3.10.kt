package kotlin_in_action.chapter_03

/**
 * 3중 따옴표 문자열로 된 경로 파싱에 정규식 사용하기
 *
 * 3중 따옴표에서는 역슬래스(\)를 포함한 어떤 문자도 이스케이프할 필요가 없음.
 */
fun parsePath(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()   //   -> 첫 번째 그룹인 (.+)는 마지막 슬래시까지 모든 문자와 매치
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, extension: $extension")
    }
}

fun main(args: Array<String>) {
    parsePath("/Users/yole/kotlin-book/chapter.aboc")
}