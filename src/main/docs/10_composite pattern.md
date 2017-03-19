# Composite Pattern (컨테이너와 내용물을 같게 다루기)

## 학습 목표
컴포지트 패턴을 통해 트리구조를 표현

> 컨테이너, 내용물, 동일시

## 실습 예제
- 파일 시스템
- root / home / hojin / music/ track1


---

## Composite Pattern 이란?
- 부분 / 전체 (Part / Whole)의 관계를 갖는 객체들을 정의할 때 유용
- 전체와 부분을 구분하지 않고 동일한 인터페이스를 사용

## Composite Pattern 구성요소
- Component : 구체적인 부분, 즉 Leaf와 Composite 클래스의 __공통 인터페이스__를 정의
- Leaf : 구체적인 __부분 클래스__ (Composite 객체의 부품)
- Composite : __전체 클래스__로 복수개의 Component를 갖도록 정의. 즉 복수개의 Leaf 및 Composite 객체를 부분으로 가질 수 있다.