코틀린에서 루프(loop)는 반복적인 작업을 처리하기 위한 기본적인 제어 구조입니다. 코틀린은 `for`, `while`, `do..while` 등의 루프문을 제공하여 다양한 반복 작업을 수행할 수 있습니다. 각 루프문의 특징과 사용 방법을 정리하겠습니다.

### 1. `for` 루프
코틀린의 `for` 루프는 배열이나 컬렉션을 순회할 때 주로 사용됩니다. 코틀린의 `for` 루프는 범위 기반 루프와 컬렉션 기반 루프를 모두 지원합니다.

- **범위 기반 루프**
  ```kotlin
  for (i in 1..10) {
      println(i)
  }
  ```
  위 예제는 1부터 10까지의 숫자를 출력합니다. `..` 연산자를 사용하여 범위를 지정합니다.

- **컬렉션 기반 루프**
  ```kotlin
  val numbers = listOf(1, 2, 3, 4, 5)
  for (number in numbers) {
      println(number)
  }
  ```
  위 예제는 리스트 `numbers`의 각 요소를 순회하여 출력합니다.

### 2. `while` 루프
`while` 루프는 조건이 참(true)인 동안 반복적으로 블록 내의 코드를 실행합니다. 조건이 거짓(false)이 되면 루프에서 빠져나옵니다.

```kotlin
var x = 0
while (x < 5) {
    println(x)
    x++  // x 값을 증가시킵니다.
}
```
위 예제는 `x`의 값이 5보다 작은 동안 `x`의 값을 출력하고, `x`를 1씩 증가시킵니다.

### 3. `do..while` 루프
`do..while` 루프는 `while` 루프와 유사하지만, 최소 한 번은 루프 내의 코드를 실행하고 조건을 검사합니다.

```kotlin
var y = 0
do {
    println(y)
    y++
} while (y < 5)
```
위 예제는 `y`의 값이 5보다 작을 때까지 `y`의 값을 출력하고, `y`를 1씩 증가시킵니다. `do..while` 루프는 조건을 검사하기 전에 최소 한 번은 코드를 실행하기 때문에, 조건이 처음부터 거짓이라도 코드 블록이 한 번 실행됩니다.

### 반복 제어
- `break`를 사용하여 루프를 즉시 종료할 수 있습니다.
- `continue`를 사용하여 현재 반복을 건너뛰고 다음 반복으로 진행할 수 있습니다.

루프는 프로그램에서 반복 작업을 효율적으로 처리하기 위해 꼭 필요한 기능입니다. 코틀린의 각 루프 구조를 이해하고 적절히 사용하면 다양한 프로그래밍 문제를 해결하는 데 큰 도움이 됩니다.