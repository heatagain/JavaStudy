package Exam02;

public abstract class Person {
	// 사람이라면 무조건 할 수 있는 기능
	
	// 숨쉬다
	public abstract void breath();
	// 먹다
	public abstract void eat();
	// 생각하다
	public abstract void think();
	

}






//- 추상 메소드 (abstract method)
//
//선언되어 있으나 구현되어 있지 않은 메소드
//추상 메소드 선언
//abstract 키워드로 선언
//ex) public abstract int getValue();
//
//추상 메소드는 반드시 서브 클래스에서 오버라이딩하여 구현
//
//- 추상 클래스 (abstract class)
//추상 메소드를 하나라도 가진 클래스
//클래스 앞에 반드시 abstract라고 선언해야 함
//추상 메소드가 하나도 없지만 클래스 앞에 abstract로 선언한 경우
//
//- 추상 클래스의 객체는 생성할 수 없다
//
//- 추상 클래스 필요성
//상속 관계에서 서브클래스가 반드시 추상메소드를 구현해야 함을 알릴 때(강제성)
//설계와 구현 분리
//	슈퍼 클래스(설계도)에서는 개념적 특징 정의
//	서브 클래스(구현)에서 구체적 행위 구현