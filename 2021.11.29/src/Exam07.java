import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 >> ");
		int num1 = sc.nextInt();

		System.out.print("두번 째 정수 >> ");
		int num2 = sc.nextInt();

		System.out.print("연산자 입력(+, -, *, /) >> ");
		String op = sc.next();

		System.out.println("결과값 : " + cal(num1, num2, op));

	}

	public static int cal(int num1, int num2, String op) {

		// 결과를 담을 수 있는 변수 결정

		// 연산자 비교하기
		if (op.equals("-")) {
			// 연산에 따른 작업 진행
			return num1 - num2;

		} else if (op.equals("*")) {
			return num1 * num2;

		} else if (op.equals("+")) {
			return num1 + num2;

		} else if (op.equals("/")) {
			return num1 / num2;

		} else {
			return 0;
		}
	}

//	public static int cal(int x1, int x2, char op) {
//		
//		if(op == '-') {
//			return x1 - x2;
//		} else {
//			return x1 * x2;
//		}
//	}

}
