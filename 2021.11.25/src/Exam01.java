import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		int i;
		int input;
		int count = 1;
		String[] array = { "수", "박" };
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 수박 게임 Start! ====");
		System.out.print("숫자를 입력해주세요>> ");
		input = sc.nextInt();

		while (count <= input) {
			for (i = 0; i < 2; i++) {
				if(count <= input) {
				System.out.print(array[i]);
				}
				count++;
			}
		}
		
//		for(i = 0; i<input; i++) {
//			if(i%2==0) {
//				System.out.println(array[0]);
//			} else {
//				System.out.println(array[1]);
//			}
//		}
		//2. 두번째 방법
		// 사용자가 숫자를 입력하면
		// 입력한 숫자에 맞게 array(배열) 생성
		// 배열안에는 "수", "박" 이란 글자가 순서대로 들어가도록 대입
		// 마지막으로 배열 출력
		
//		System.out.print("숫자를 입력 >> ");
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		
//		String[] array = new String[size];
//		for(int i = 0; i < array.length; i++) {
//			if(i%2==0) {
//				array[i] = "수";
//				
//			} else {
//				array[i] = "박";
//			}
//		}
//		for(int i = 0; i<size; i++) {
//			System.out.print(array[i]);
//		}
//		
		// System.out.println(Arrays.toString(array)); // for문 없이 배열 출력
		sc.close();
	}

}
