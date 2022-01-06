import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {

		// 이차원 배열의 생성
		// 자료형[][] 배열명 = new 자료형[첫번째 방][두번째 방]

		// 5행 5열의 배열 생성하기
		int[][] array = new int[5][5];

		// 1. 배열에 데이터 값 저장하기

//		array[0][0] = 1;
//		array[0][1] = 2;
//		array[0][2] = 3;
//		array[0][3] = 1;
//		array[0][4] = 2;

//		array[1][0] = 3;
//		array[1][1] = 7;

		// 하나씩 값이 증가되는 변수 사용
		int num = 1;

		// 배열을 손쉽게 저장하기 위해 이중 for문 활용하기
		// 행(층)을 반복해줄 수 있는 for문 작성
		for (int i = 0; i < array.length; i++) {
			// 열(방의 호수)을 반복해줄 수 있는 for문 작성
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}

		// 2. 배열에 댇한 값 확인하기 -> 이중 for문 사용
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
