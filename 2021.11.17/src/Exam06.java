import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		// 키보드로부터 데이터 입력받기
		Scanner sc = new Scanner(System.in);

		/*System.out.print("숫자를 입력해주세요 >> ");
		int i = sc.nextInt();
		System.out.println("결과 : " + i);
		// 어떤한 값을 입력하든지 백의자리 아래 값을 버리고 출력하시오
		// 예) 456 입력 -> 결과 : 400
		 * 
		 */
		
		System.out.print("입력 >> ");
		int a = sc.nextInt();
		//int result = a / 100 * 100;
		String result = a / 100 + "00";
		System.out.println("결과 : " + result );
		
		
	}

}
