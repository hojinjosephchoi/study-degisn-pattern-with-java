# Command pattern

## OCP (Open Closed Principle)
- 소프트웨어 설계원칙 (SOLID) 중 하나
- 기능 추가 시 기존 코드를 수정하지 않아야 함

## Command Pattern란?
- 이벤트 발생 시 실행될 기능이 다양하면서, 기능을 변경해야 할 경우, 이벤트를 발생시키는 클래스를 변경하지않고 재사용 하고자 할 때 유용
- 실행될 기능을 캡슐화하여, 기능의 실행을 요구하는 호출자(Invoker) 클래스와 실제 기능을 실행하는 수신자(Receiver) 클래스 사이의 의존성을 제거한다.
- 실행될 기능의 변경에도 호출자 클래스의 수정이 필요 없다.

## Command Pattern 클래스다이어그램
![Command pattern 클래스다이어그램](https://upload.wikimedia.org/wikipedia/commons/8/8e/Command_Design_Pattern_Class_Diagram.png)

## Command Pattern 구성요소
- Command : 실행될 기능에 대한 인터페이스, 실행될 기능을 execute 메소드로 선언
- ConcreteCommand : 실제 실행되는 기능 구현
- Invoker : 기능의 실행을 요청하는 호출자 클래스
- Receiver : ConcreteCommand의 기능을 실행하기 위해 사용하는 수신자 클래스

## Command Pattern 실행절차
1. 클라이언트가 원하는 Command 객체를 생성
2. Invoker 객체에 바인딩
3. Invoker 객체에서 바인딩된 Command 객체의 execute 메소드 실행
4. execute 메소드는 Receiver 객체의 action 메소드를 호출하여 원하는 기능 실행

> Receiver만 없다면 Strategy Pattern과 매우 유사한 것 같다.