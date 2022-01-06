
public class Exam06 {

	public static void main(String[] args) {

		// 공포의 별찍기 2

		char star = '*';

		for (int i = 1; i <= 5; i++) {	// 줄 바꿈 for문
			for (int j = 5; j >= i; j--) {	// *출력 for문 (5부터 시작해서 j값이 1보다 크거나 같을 때까지)
				System.out.print(star);
			}
			System.out.println();
		}

	}

}
