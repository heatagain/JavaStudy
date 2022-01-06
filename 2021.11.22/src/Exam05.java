
public class Exam05 {

	public static void main(String[] args) {

		// 공포의 별찍기
		char star = '*';

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(star);
			}
			System.out.println();
		}

	}

}
