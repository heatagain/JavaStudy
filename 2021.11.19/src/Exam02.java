
public class Exam02 {

	public static void main(String[] args) {
		// while을 활용하여 1부터 100까지 숫자중 3의 배수만 출력

		int i = 2;
		int j = 0;

		while (i <= 100) {

			j = i % 3;
			if (j == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
