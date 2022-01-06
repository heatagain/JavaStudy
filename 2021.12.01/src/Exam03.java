import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		int[] array = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 원소 입력 >> ");
			array[i] = sc.nextInt();
		}

		// 버블정렬
		for (int i = 0; i < array.length - 1; i++) {	// 버블 반복 횟수 n - 1
			for (int j = 0; j < array.length - i - 1; j++) {
				// 현재 원소가 인접한 원소보다 크다면
				// 값을 바꾸어 주세요
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");
		}

	}

}
