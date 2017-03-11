# State pattern

## State machine diagram
상태와 상태 변화를 모델링하는 도구
- 상태 (State) : 객체의 라이프 타임동안 객체가 가질 수 있는 어떤 조건이나 상황을 표현
- 상태 전이 (State transition) : 특정 상태에서 어떤 Activity 수행 / Event 발생으로 다른 상태로 변하는 것

![State machine diagram 예제](http://cfile1.uf.tistory.com/image/124E510E4ACC73C51AD6DB)

## State pattern

### 메소드 내 상태 분기 처리시 문제점
- 복잡한 조건문에 상태 변화가 숨어있는 경우, 상태 변화가 어떻게 이루어지는지 이해하기 어렵고 새로운 상태 추가에 맞춰모든 메소드를 수정해야 한다.


### State pattern 이란?
상태에 따라 동일한 작업이 다른 방식으로 실행될 때 해당 상태가 작업을 수행하도록 위임하는 디자인 패턴

### 특징
- Strategy pattern과 유사 (동일)
- 어떤 행위를 수행할 때 상태에 행위를 수행하도록 위임
- 각 상태를 클래스로 분리
- 각 클래스에서 수행하는 행위들을 메소드로구현
- 이러한 상태들을 외부로부터 캡슐화 하기 위해 인터페이스를 만들어 시스템의 각 상태를 나타내는클래스로 하여금 실체화하게 함

### 추가 팁
- State 구현체에 Singleton 패턴을 적용하여 상태변화가 생길때마다 새로운 객체 생성없이 메모리 낭비 / 성능 저하를 방지할 수 있다.

![state pattern 예제](http://wiki.gurubee.net/download/attachments/1507413/statediagram.gif)


## State Pattern VS. Strategy Pattern
### 공통점
- 행위 자체를 별도의 클래스로 캡슐화
- 연관관계를 이용해 행위를 캡슐화한 클래스에서 실제 작업 수행을 위임
- 실행 중 행위 변경 가능

### 차이점
- State Pattern은 Client에서 상태객체와 관련된 어떤 지식도 없다. 
- State Pattern은 실행 중 행위(상태)가 자주 변경된다.
- Strategy Pattern은 context에서 행위(전략)가 한번 고정되면 자주 변경되지 않는다.
- State Pattern은 상태변경을 State요소를 구현한 클래스 자신이 수행
- Strategy Pattern은 행위 시작, 변경 등이 Client에 의해 이루어지며 통제된다.