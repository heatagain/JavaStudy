import java.util.Scanner;

public class Exam04 {
	// Main 메소드
	public static void main(String[] args) {
		
		// 클래스와 같은 위치에 메소드를 생성할 경우
		// 꼭 static 키워드 붙여주기
		
		// 1. 메소드의 구조
		// - 접근 제한자 : public
		// - 리턴 타입 : 메소드 수행 이후 결과값으로 돌아오는 데이터에 대한 타입
		// - 메소드의 이름
		// - 메소드가 사용할 X값 -> 메소드 매개변수, 소괄호 안에 들어갈 내용
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		int result = addNumber(num1, num2);
		System.out.println(result);
		
		
		// 메소드는 크게 메소드 호출과 메소드 정의로 작업이 진행된다.
		

	}// main() 끝나는 부분
	
	// 새롭게 메소드를 만들 수 있는 영역
	// 접근지정자 public -> 내부/외부 어디서든 접근이 가능한 지정자
	public static int addNumber(int x1, int x2) {
		
		int result = x1 + x2;
		
		return result;
	}

	
	
	
}// class 끝나는 부분
