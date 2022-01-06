package Exam02;

public class MyKart implements Kart {
	// 인터페이스에서 상속받은 추상 메소드는 반드시 구현 해주어야 함
	
	int myposition = position; // MyKart 가 생성되면
	// 무조건 myPosition 은 0이다(시작위치)
	
	@Override
	public void go(int num) {
		myposition += num;
		System.out.println("가자");
		//System.out.println("현재위치 : " + myposition);
		
	}

	@Override
	public void back(int num) {
		myposition -= num;
		System.out.println("뒤로뒤로");
		//System.out.println("현재위치 : " + myposition);
	}

	@Override
	public void booster(int power) {
		myposition += power;
		System.out.println("ㄱㅈㅇ~");
	//	System.out.println("현재위치 : " + myposition);
	}

	
	
	
}
