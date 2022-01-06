
public class Exam01 {

	public static void main(String[] args) {

		// 이차원 배열
		int[][] numArray = new int[3][5];
		int num = 1;
		numArray[1][2] = 3;
		numArray[2][4] = 10;
		// 입력부
		for (int j = 0; j < numArray.length; j++) {
			for (int i = 0; i < numArray[0].length; i++) {

				numArray[j][i] = num;
				num++;
			}

		}

		// 출력부
		for (int j = 0; j < numArray.length; j++) {
			// 한행 출력
			for (int i = 0; i < numArray[0].length; i++) {
				System.out.print(numArray[j][i] + " ");
			}
			System.out.println();	// 한행 출력 될때마다 줄바꿈

		}

	}

}
