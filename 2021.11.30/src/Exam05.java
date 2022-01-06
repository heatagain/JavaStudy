import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();

		// num의 약수의 대한 합계
		int result = getSumOfDivisors(num);

		System.out.println(num + "의 약수의 합 : " + result);

		// num의 약수들을 출력
		getDivisor(num);

	}

	public static void getDivisor(int num) {

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;
		// 나 자신까지의 약수를 구한 후
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		// 해당하는 약수에 대해서 합계 구하기
		return sum;
	}

}
