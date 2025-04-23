package kotlinStudy.lec01

import com.lannstark.lec01.Person

class Lec01 {

    /* 코틀린에서의 변수 선언 */
    var number1: Long = 10L //(1) var는 바꿀 수 있는 가변변수
    val number2: Long = 10L //(2) val는 바꿀 수 없는 불변변수 final
    // 코틀린에서는 모든 변수에 수정 가능 여부(var/val)를 명시해주어야 함
    // 코틀린에서는 타입을 자동으로 추론해줌. 하지만 명시적으로 작성해줘도 된다.

    /* 코틀린에서의 Primitive Type, nullable 변수 */
    var number3: Long? = 1_000L
    // 코틀린에서는 Primitive, Reference 타입을 알아서 똑똑하게 내부적으로 적절하게 처리해줌
    // 프로그래머가 boxing과 unboxing을 고려하지 않아도 되도록 코틀린이 알아서 처리해줌
    // 코틀린에서 null이 변수에 들어갈 수 있다면 타입뒤에 ? 를 붙여줘야 한다.

    /* 코틀린에서의 객체 인스턴스화 */
    val person = Person("김지명")
    // new를 붙이지 않는다.

}