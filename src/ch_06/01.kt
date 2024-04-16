package ch_06

/**
 * fileName       : `01`
 * date           : 2024-04-16
 * time           : 오후 2:02
 * ===========================================================
 * description    :
 * ### 클래스
 * 간단하게 보면 클래스는 단지 변수와 함수의 모음.
 * 그룹화 할 수 있는 변수와 함수를 한군데 모아 놓고 사용하기 쉽게 이름을 붙여놓은 것을 클래스 라고 이해하면 가장 좋은 접근.
 */
fun main() {
    /*
    1. 코틀린에서 사용되는 클래스의 기본 구조

    class 클래스이름 {
        var 변수
        fun 함수() {
            코드
        }
    }
     */

    /*
    2. 클래스 코드 작성하기
    클래스를 만들기 위해서는 먼저 클래스의 이름을 정하고, 이름 앞에 class 키워드를 붙여서 만들 수 있음.
    클래스 이름 다음에는 클래스의 범위를 지정하는 중괄호({})가 있어야 함.
    이 중괄호를 스포크 Scope라고 하는데, 클래스에서 사용했기 때문에 클래스 스코프라고 함.

    class 클래스이름 {
        // 클래스 스코프 class scope
    }
        '몇몇 예외'는 있지만 대부분의 코드는 클래스 스코프 안에 작성.

        작성된 클래스를 사용하기 위해서는 생성자라고 불리는 함수가 호출되어야 하는데,
        코틀린은 프라이머리 primary 와 세컨더리 Secondary 2개의 생성자를 제공.
     */
    /*

    1) 프라이머리 생성자
    class Person 프라이머리 생성자(){

    }
    함수에 있는 코드를 실행하려면 함수를 호출해야 함.
    클래스도 마찬가지로 클래스를 사용한다는 것은 곧 클래스라는 이름으로 묶여 있는 코드를 실행하는 것이기 떄문에
    함수 형태로 제공되는 생성자를 호출해야지만 클래스가 실행.

    프라이머리 Primary 생성자는 마치 클래스의 헤더처럼 사용할 수 있으며
    constructor 키워드를 사용해서 정의하는데 조건에 따라 생략할 수 있음.
    프라이머리 생성자도 결국 함수이기 때문에 파라미터를 사용할 수 있음.

    class Person constructor(value: String){
        // 코드
    }
    클래스의 생성자가 호출되면 init 블록의 코드가 실행되고, init 블록에서는 생성자를 통해 넘어온 파라미터에 접근할 수 있음.
     */

    class Person1(str: String) {
        init {
            println("생성자로부터 전달받은 값은 ${str}입니다")
        }
    }

    var person1 = Person1("1") // 생성자로부터 전달받은 값은 1입니다

    /*
    하지만 init 초기화 작업이 필요하지 않다면 init 블록을 작성하지 않아도 됨.
    대신 파라미터로 전달된 값을 사용하기 위해서는 파라미터 앞에 변수 키워드인 val을 붙여주면
    클래스 스코프 전체에서 해당 파라미터를 사용할 수 있음.
     */
    class Person2(val str: String) {
        fun process() {
            println("생성자로 생성된 값은 ${str}입니다")
        }
    }

    val person2 = Person2("2")
    person2.process() // 생성자로 생성된 값은 2입니다

    /*
    생성자 파라미터 앞에 var 도 사용할 수는 있으나, 읽기 전용인 val 을 사용하는 것을 권장.
     */

    /*
     2) 세컨더리 생성자
     세컨더리 Secondary 생성자는 constructor 키워드를 마치 함수처럼 클래스 스코프 안에 직접 작성할 수 있음.
     그리고 다음과 같이 init 블럭을 작성하지 않고 constructor 다음에 괄호를 붙여서 코드를 작성할 수 있음.
     */
    class Person3 {
        constructor(str: String) {
            println("생정자로부터 전달받은 값은 ${str}입니다.")
        }
    }

    /*
     세컨더리 생성자는 파라미터의 개수, 또는 파라미터의 타입이 다르면 (오버로딩) 여러 개를 중복해서 만들 수 있음.
     */
    class Sample {
        constructor(str: String) {
            println("생성자로부터 전달받은 값은 ${str}입니다.")
        }

        constructor(value: Int) {
            println("생성자로부터 전달받은 값은 ${value}입니다.")
        }

        constructor(value1: Int, value2: String) {
            println("생성자로부터 전달 받은 값은 ${value1}, ${value2}입니다.")
        }

    }
    val sample = Sample(1,"2") // 생성자로부터 전달 받은 값은 1, 2입니다.

    val sample2 = Sample("2") // 생성자로부터 전달받은 값은 2입니다.

    /*
    3) Default 생성자
    생성자는 작성하지 않을 경우 파라미터가 없는 프라이머리 생성자가 하나 있는 것과 동일.
     */
    class Student { // 생성자를 작성하지 않아도 기본 생성자가 동작.
        init {
            // 기본 생성자가 없더라도 초기화가 필요하면 여기에 코드를 작성.
        }
    }

    /*
    3. 클래스의 사용.
    클래스의 이름에 괄호를 붙여서 클래스의 생성자를 호출.
    constructor 키워드를 호출하지 않음.

    클래스명()

    아무런 파라미터 없이 클래스명에 괄호를 붙여주면 생성자가 호출되면서 init 블록 안의 코드가 자동으로 실행.
    세컨더리 생성자의 경우 init 블록이 먼저 실행되고 constructor 블록 안의 코드가 실행.
     */
    /*
    코틀린에서는 자바보다 클래스를 좀 더 편하게 정의할 수 있음.
    자바의 보일러 플레이트 코드가 삭제되고 필요한 코드들만 작성하면 되도록 바뀜.
    * 보일러 플레이트 코드 : 상용구 코드. 변형이 거의 없는 혹은 전혀 없이 여러 위치에서 반복되는 코드 문구.
     */
    class Car(val color: String)
    /*
     객체를 생성. 자바에서는 new 키워드를 사용했지만, 코틀린에서는 필요가 없음
     */
    var car = Car("blue")
    println(car.color) // blue
}
