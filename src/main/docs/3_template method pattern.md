# Template Method Pattern (공통적인 프로세스를 묶어주기)

## 학습목표

__일정한 프로세스__를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현할 수 있다.

## Template Method Pattern이란?

알고리즘의 __구조를 메소드에 정의__하고 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 __재정의__하는 패턴

- 구현하려는 알고리즘이 __일정한 프로세스__가 있다. (여러 단계로 나눌 수 있다.)
- 구현하려는 알고리즘이 __변경 가능성__이 있다.

## Template Method Pattern 구현단계
- 알고리즘을 __여러 단계__로 나눈다.
- 나눠진 알고리즘의 단계를 __메소드로 선언__한다.
- 알고리즘을 수행할 __템플릿 메소드__를 만든다.
- 하위 클래스에서 __나눠진 메소드들을 구현__한다.


## 요구사항
1. 신작 게임의 접속을 구현해주세요
	- requestConnection(String str): String
2. 유저가 게임 접속시 다음을 고려해야 합니다.
	- 보안과정 : 보안관련 부분을 처리합니다.
		- doSecurity(String str): String
	- 인증과정 : user name과 password가 일치하는지 확인합니다.
		- doAuthentication(String id, String pw): boolean
	- 권한과정 : 접속자가 유료회원인지 무료회원인지 게임 마스터인지 확인합니다.
		- doAuthorization(String userName): int
	- 접속과정 : 접속자에게 커넥션 정보를 넘겨줍니다.
		- doConnection(String info): String

## 추가 요구사항
- 보안 부분이 정부정책에 의해서 강화되었습니다. 강화된 방식으로 코드를 변경해야 합니다.
- 여가부에서 밤 10시 이후에 접속이 제한되도록 합니다.