package Exam02;

public class 동윤 extends Person {
	// 추상 메소드가 있는 추상 클래스를 상속 받는다면
	// 반드시 추상 메소드를 구현 해줘야 함

	@Override
	public void breath() {
		System.out.println("동윤 숨쉬다");
		
	}

	@Override
	public void eat() {
		System.out.println("짜장면 곱빼기를 먹다");
		
	}

	@Override
	public void think() {
		System.out.println("동윤 생각하다");
		
	}

	
}
