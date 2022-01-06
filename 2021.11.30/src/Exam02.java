import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 >> ");
		int num2 = sc.nextInt();

		int result = close10(num1, num2);
		System.out.println("10에 가까운 수 : " + result);

	}

	public static int close10(int x1, int x2) {

//		int dev = 10 - x1;
//		if (dev < 0) {
//			dev *= -1;
//		}
//		//dev = dev > 0 ? dev : dev * -1;
//		
//		int dev2 = 10 - x2;
//		if (dev2 < 0) {
//			dev2 *= -1;
//		}
//		// dev2 = dev2 > 0 ? dev2 : dev2 * -1;
		
		// math class에 있는 abs() 절대값 함수 사용하기
		int a = Math.abs(10 - x1);
		int b = Math.abs(10 - x2);

		if (a < b) {
			return x1;
		} else if (a > b) {
			return x2;
		} else {
			return 0;
		}

	}

}
