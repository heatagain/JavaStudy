
public class Exam02 {

	public static void main(String[] args) {

		int i;
		int j = 2;

		for (j = 2; j <= 30; j++) {	// 2부터 30까지 증가하는 j
			System.out.print(j + "의 약수 : ");	// j의 약수 출력

			for (i = 1; i <= j; i++) {	// i값이 j 자신까지 실행
				if (j % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

	}

}
