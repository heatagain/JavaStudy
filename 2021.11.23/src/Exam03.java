
public class Exam03 {

	public static void main(String[] args) {

		int i;
		int j;
		int sum = 0;

		for (i = 2; i <= 1000; i++) {
			for (j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (i == sum) {
				System.out.println(i);

			}
			sum = 0;

		}

	}

}
