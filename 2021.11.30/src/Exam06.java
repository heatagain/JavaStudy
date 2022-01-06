
public class Exam06 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 2;
		
		// 두개 수를 더해줄 수 있는 add() 만들기
		
		add(10, 2);
		add(10, 2.5);

	}
	
	// 기존의 add 메소드 
	public static void add(int a, int b) {
		System.out.println(a + b);
		
	}
	
	// 정수형의 add 메소드를 중복정의 하여 생성된 메소드
	public static void add(int a, double b) {
		System.out.println(a + b);
		
	}
	
	// 메소드 이름이 같아야함
	// 매개변수의 개수 또는 타입이 달라야함 ★
	// 매개변수는 같고 리턴타입이 다른 경우는 오버로딩이 아님
	
	// 메소드이름의 낭비방지
	// 같은 메소드에 여러 종류의 매개변수를 받을 수 있음
	

}
