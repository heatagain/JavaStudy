import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 약수 구하기
		int num;
		int i;
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		num = sc.nextInt();

		for (i = 1; i <= num; i++) {	// 1부터 num 까지 증가
			if (num % i == 0) {	// num을 i로 나눴을 때 나머지가 0이면
				System.out.print(i);	// i값 출력
				if (i != num) {	// i가 num과 같지 않을 때까지 쉼표 출력
					System.out.print(", ");
				}
			}
		}
		sc.close();
	}
}
