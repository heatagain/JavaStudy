package 상속01;

public class Folder extends Tell{
	// 상속받을 하위 클래스
	// 하위클래스명 extends 상위클래스명
	// 상위 클래스에 있는 데이터와 기능을 전부 물려받는다
	
	// 확장 -> 필요한 기능만 추가로 개발
	public void Camera() {
		System.out.println("사진을 찍다");
	}
	// 오버라이딩 -> 재정의
	@Override	// 어노테이션 참조
	public void ButtonClick() {
		System.out.println("똑 똑 똑 버튼을 클릭합니다");
	}
	
}
// 1. 다중상속을 지원하지 않는다.
// 2. 상속의 횟수에 제한을 두지 않는다.
// 3. 최상위 클래스는 Object이다.