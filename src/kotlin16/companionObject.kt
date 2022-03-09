package kotlin16

/**
 * 클래스도 Object 를 만들수있음 (=companion Object)
 * 각 인스턴스에서 공용 속성 및 함수를 묶어낸다
 * Static 멤버와 비슷하다
 */

fun main () {
    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println ("${a.name} : ${a.count}")
    println ("${b.name} : ${b.count}")
    println ("총계 : ${FoodPoll.total}")
}

class FoodPoll (val name: String) {
    companion object {
        var total = 0
    }

    var count = 0

    fun vote() {
        count++
        total++
    }
}
