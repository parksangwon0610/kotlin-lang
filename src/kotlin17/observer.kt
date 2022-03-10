package kotlin17

/**
 * 함수로 직접 요청하지 않았지만
 * 시스템 또는 루틴에 의해서
 * 발생하게 되는 동작들을
 * 이벤트라고 부르며 이벤트가 발생할 때 마다
 * 즉각적으로 처리할 수 있도록 만드는 프로그래밍 패턴을 옵저버패턴이라고 부릅니다
 * 다른 클래스에서 이벤트가 발생할 때, 리스너에게 이벤트를 넘겨주는 행위를 콜백이라고 함
 */
fun main () {
    EventPrinter().start()
}

interface EventListener {
    fun onEvent(count:Int)
}

class Counter (var listener: EventListener) {

    fun count() {
        for(i in 1..100) {
            if (i%5 == 0) listener.onEvent(i)
        }
    }
}

/**
 * 익명객체 생성하여 옵저버 패턴 작성
 */
class EventPrinter {
    fun start() {
        val counter = Counter(object: EventListener {
            override fun onEvent(count: Int) {
                print("${count}-")
            }
        })
        counter.count()
    }
}

//class EventPrinter: EventListener {
//    override fun onEvent(count: Int) {
//        print("${count}-")
//    }
//
//    fun start() {
//        val counter = Counter(this)
//        counter.count()
//    }
//}