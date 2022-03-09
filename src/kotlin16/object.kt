package kotlin16

/**
 * Object 는 생성자 없이 객체를 직접 만들 수 있다.
 * Class 는 인스턴스 객체를 만들기 위한 틀이기 때문에
 * 내부에 있는 속성이나 함수를 사용하려면 생성자를 통해
 * 실체가 되는 인스턴스 객체 만들어야 했음
 * 공통적인 함수나 속성을 사용해야하는 코드에서는
 * 굳이 class 말고 Object 를 사용하면
 * 싱글톤 패턴을 언어차원에서 지원하는 것
 * 최초 사용시 자동생성, 이후에는 코드 전체에서 공용으로 사용가능
 */

fun main() {
    println(Counter.count)

    Counter.countUp();
    Counter.countUp();

    println(Counter.count)

    Counter.clear()

    println(Counter.count)
}

object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
}

