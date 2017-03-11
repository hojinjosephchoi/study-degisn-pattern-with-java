# State pattern

## State machine diagram
상태와 상태 변화를 모델링하는 도구
- 상태 (State) : 객체의 라이프 타임동안 객체가 가질 수 있는 어떤 조건이나 상황을 표현
- 상태 전이 (State transition) : 특정 상태에서 어떤 Activity 수행 / Event 발생으로 다른 상태로 변하는 것

![State machine diagram 예제](http://cfile1.uf.tistory.com/image/124E510E4ACC73C51AD6DB)

## State pattern

### 상태
- 문제점 : 복잡한 조건문에 상태 변화가 숨어있는 경우, 상태 변화가 어떻게 이루어지는지 이해하기 어렵고 새로운 상태 추가에 맞춰모든 메소드를 수정해야 한다.


### State pattern 이란?
상태에 따라 동일한 작업이 다른 방식으로 실행될 때 해당 상태가 작업을 수행하도록 위임하는 디자인 패턴

### 특징
- Strategy pattern과 유사 (동일)
- State 구현체에 Singleton 패턴을 적용하여 상태변화가 생길때마다 새로운객체 생성없이 메모리 낭비 / 성능 저하를 방지할 수 있다.

![state pattern 예제](http://wiki.gurubee.net/download/attachments/1507413/statediagram.gif)