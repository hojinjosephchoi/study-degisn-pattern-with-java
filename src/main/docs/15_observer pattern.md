# Observer Pattern (상태 변화 관찰하기)

## 학습 목표
__옵저버 패턴__을 통해 __이벤트 발생__ 후 __객체 외부에서 처리__ 할 수 있다.

## 키워드
객체 외부, 이벤트 처리

## 실습
1. Button (Observable), OnClickListener (Observer)
2. Java API 활용
3. Java API 확장 (Generics, Delegate)
4. 추가실습 (Subject, Observer, Concrete Subject, Concrete Observers)

----

## Observer Pattern이란?
- __데이터의 변경이 발생__했을 때, 상대 클래스나 객체에 의존하지 않으면서 __데이터 변경을 통보__ 할 때 유용
- 통보 대상 객체의 관리를 Subject 클래스와 Observer 인터페이스로 일반화(추상화)
- 통보 대상 클래스나 대상 객체의 변경에도 Concrete Subject 클래스 수정없이 그대로 사용가능

## Observer Pattern 역할수행 4 요소
- Observer : 데이터의 변경을 통보 받는 인터페이스
- Subject : Concrete Observer 객체를 관리하는 요소. Observer 인터페이스를 참조해서 Concrete Observer를 관리하므로 ConcreteObserver의 변화에 독립적이다.
- Concrete Subject : 변경 관리 대상이 되는 데이터가 있는 클래스
- Concrete Observer : Concrete Subject의 변경을 통보받는 클래스, Observer 인터페이스의 update 메소드를 구현하여 변경을 통보받는다.

![Observer Pattern Class Diagram](http://java.dzone.com/sites/all/files/observer_pattern.PNG)