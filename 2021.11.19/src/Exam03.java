import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// 랜덤숫자 추출하기
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int life = 3;

		System.out.println("PLUS GAME!!");
		// 오답일때는 이전 문제가 다시 출제
		// 정답일때는 새로운 문제가 출제

		while (life > 0) {
			int num1 = random.nextInt(5) + 1;
			int num2 = random.nextInt(5) + 1;

			while (life > 0) {
				System.out.print(num1 + " + " + num2 + " = ");
				int answer = sc.nextInt();
				int result = num1 + num2;

				if (answer == result) {
					System.out.println("정답입니다!");
					break;
				} else {
					System.out.println("오답입니다..");
					life = life - 1;
				}

			}

		}
		System.out.println("게임 끝");
		sc.close();
	}

}
