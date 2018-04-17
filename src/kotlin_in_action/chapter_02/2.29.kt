package kotlin_in_action.chapter_02

import java.io.BufferedReader
import java.io.StringReader

/**
 * try 키워드는 if나 when과 마찬가지로 식이다.
 */
fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("not a number"))
    readNumber(reader)
}