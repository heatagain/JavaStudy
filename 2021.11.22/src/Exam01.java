
public class Exam01 {

	public static void main(String[] args) {

		int result = 0;
		// 1부터 100까지의 3의 배수의 총합 출력
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0) {
				result = result + i;
			}

		}
		System.out.println("총합 : " + result);

	}

}
