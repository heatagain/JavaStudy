package 조건문;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// 정답 맞추기
		int answer = 10;
		int i;

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정답을 입력해주세요 >> ");
		i = sc.nextInt();

		if (i == answer) {

			System.out.println("정답입니다");
		} else
			System.out.println("프로그램 종료!");

	}

}
