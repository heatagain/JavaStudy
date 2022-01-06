package Exam01;

public class mouseMain {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		wheelMouse mouse2 = new wheelMouse();
		
		mouse.leftClick();
		mouse.rightClick();
		
		mouse2.leftClick();
		mouse2.rightClick();
		mouse2.scroll();	// 확장
		
		
		// 업캐스팅 -> 하위 클래스의 객체가
		// 상위 클래스의 객체 타입으로 형변환
		Mouse mouse3 = mouse2;
		mouse3.rightClick();
		// 오버라이딩한 기능일 경우
		// 업캐스팅 하더라도 자식에 있는 기능을 사용한다
		mouse3.leftClick();

		
	}

}
