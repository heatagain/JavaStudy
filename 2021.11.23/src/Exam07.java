
public class Exam07 {

	public static void main(String[] args) {

		// 길이가 5인 배열을 만들고
		// 1,2,3,4,5 값을 각 인덱스 0번째 부터 저장한다음
		// 배열안에 모든 값을 출력하세요
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
			System.out.println(array[i]);
		}
//		for (int i = 0; i < 5; i++) {
//			System.out.println(array[i]);
//		}

	}

}
