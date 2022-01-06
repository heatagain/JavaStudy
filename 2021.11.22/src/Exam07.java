
public class Exam07 {

	public static void main(String[] args) {

		// 공포의 별 찍기 3
		int i;
		int j;
		for (i = 5; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 5; k >= j; k--) {
				System.out.print('*');

			}
			System.out.println();
		}

	}

}
