import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		int i;
		int j;
		int temp;
		int[] array = new int[6];
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < array.length; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			array[i] = sc.nextInt();
		}

		for (j = 0; j < 5; j++) {	// 오름차순으로 정렬
			for (i = 0; i < 5; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}
		
		for (i = 0; i < 6; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
