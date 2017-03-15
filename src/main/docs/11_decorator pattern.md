# Decorator Pattern (동적으로 책임 추가)

## 학습 목표
__동적__으로 __책임 추가__가 필요할 때 __데코레이터 패턴__을 사용할 수 있다.

> 실시간으로 어떤 기능을 해야 할 때...


## UML 설명
- Component : 실질적인 인스턴스를 컨트롤 하는 역할
- ConcreteComponent : Component의 실질적인 인스턴스의 부분이며, 책임주체의 역할
- Decorator : Component와 Concrete Decorator를 동일시 하도록 해주는 역할
- Concrete Decorator :  실질적인 장식 인스턴스 및 정의이며 추가된 책임의 주체 부분


## 예제 - 커피 제조 방법
- 에스프레소 : 커피의 기본

- 아메리카노 : 에스프레소 + 물
- 카페라떼 : 에스프레소 + 스팀밀크

- 헤이즐넛 : 아메리카노 + 헤이즐넛 시럽

- 카페모카 : 카페라떼 + 초콜릿
- 카라멜 마끼아또 : 카페라떼 + 카라멜 시럽

---

## Decorator Pattern이란?
__기본 기능__에 __추가할 수 있는 기능__의 종류가 많은 경우에 각 추가 기능을 Decorator 클래스로 정의한 후 필요한 Decorator 객체를 __조합__함으로써 __추가 기능의 조합을 설계하는 방식__
- 새로운 부가기능 필요 시 기본기능을 상속받는 형태로 확장하는 경우, 각 기능별로 클래스를 추가해야 하는 단점 발생
- 부가기능 간 조합을 하고자 할 경우 새로운 하위 클래스를 만들어야 하기 때문에 OCP 원칙에 위배된다.
> Decorator Pattern을 통해 원활한 조합이 가능하도록 한다.

## Decorator Pattern 구성요소
- Component : 기본기능을 뜻하는 Concrete Component와 추가기능을 뜻하는 Decorator의 공통기능을 정의
- Concrete Component : 기본기능을 구현하는 클래스
- Decorator : 많은 수가 존재하는 구체적인 Decorator의 공통기능을 제공
- Concrete Decorator : 기본기능에 추가되는 개별적인 기능 (부가기능을 구현한 클래스)