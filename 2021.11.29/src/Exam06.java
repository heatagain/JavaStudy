
public class Exam06 {

	public static void main(String[] args) {
		// 메소드 구조
		// 1. public 접근 지정자
		// 2. static 키워드
		// 3. 리턴의 타입(return) / void (리턴 타입 없음)
		// 4. 함수 명
		// 5. 매개변수 -> 알고리즘의 계산을 위한 x값
		// 메소드를 사용하는 방법
		// 1. 메소드의 정의 (class 안, main메소드 밖에서 지정)
		// 2. 메소드 호출(사용하고자 하는 함수의 이름을 작성한다)

		add(3, 5);
		System.out.println(add2(3, 5));
		sub(3, 5);
		mul(3, 5);
		div(3, 5);
	}

	public static void add(int x1, int x2) {

		int result = x1 + x2;
		System.out.println(result);
	}

	public static int add2(int x1, int x2) {

		System.out.println(x1 + x2);
		return x1 + x2;

	}

	public static void sub(int x1, int x2) {

		int result = x1 - x2;
		System.out.println(result);
	}

	public static void mul(int x1, int x2) {

		int result = x1 * x2;
		System.out.println(result);
	}

	public static void div(int x1, int x2) {

		int result = x1 / x2;
		System.out.println(result);
	}
}
