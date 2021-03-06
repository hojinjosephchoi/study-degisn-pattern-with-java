# Factory Method Pattern (생성의 템플릿 메소드 패턴)

## 학습목표
- 팩토리 메소드 패턴에서 __템플릿 메소드 패턴의 사용됨__을 안다.
- 팩토리 메소드 패턴에서의 __구조와 구현의 분리__를 이해하고 구조와 구현의 분리의 장점을 안다.



## 요구사항
1. 게임 아이템과 아이템 생성을 구현한다.
	- 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청한다.
	- 아이템을 생성한 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 정보를 남긴다.
2. 아이템을 생성하는 주체를 ItemCreator로 이름 짓는다.
3. 아이템은 item이라는 interface로 다룰 수 있도록 한다.
	- item은 use함수를 기본 함수로 갖고 있는다.
4. 현재 아이템의 종류는 체력회복 물약, 마력회복 물약이 있다.


---

## Factory method Pattern이란?
객체의 생성코드를 별도의 클래스 / . 메소드로 분리함으로써 객체 생성의 변화에 대비하는데 유용

## Factory method Pattern 방식
1. 하위 클래스에서 factory method를 통해 적합한 클래스의 객체를 생성하는 방식 (예제 factorymethod.ver1)
2. 객체 생성을 전담하는 별도의 클래스를 두는 방식 (예제 factorymethod.ver2)


## Factory method Pattern 구성요소
- Product : 팩토리 메소드로 생성될 객체의 공통 인터페이스
- Concrete Product : 구체적으로 객체가 생성되는 클래스
- Creator : 팩토리 메소드를 갖는 클래스
- ConcreteCreator : 팩토리 메소드를 구현하는 클래스로 ConcreteProduct 객체를 생성