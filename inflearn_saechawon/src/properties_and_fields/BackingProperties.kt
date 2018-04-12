fun main(args: Array<String>) {

}

// implicit backing field 방식을 사용할 수 없는 경우
// 'backing property' 를 이용할 수도 있음.
private var _table: Map<String, Int>? = null
public val table: Map<String, Int>
    get() {
        if (_table == null)
            _table = HashMap()
        return _table ?: throw AssertionError("null")
    }