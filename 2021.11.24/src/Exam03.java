import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		int i;
		Scanner sc = new Scanner(System.in);
		int[] ans = {1,4,3,2,1};
		int[] input = new int[5];
		int sum = 0;

		System.out.println("==체점하기==");
		System.out.println("답을 입력하세요");
		for (i = 0; i < input.length; i++) {	// 배열 인덱스 0번부터 4까지 차례대로 입력 받음
			System.out.print(i + 1 + "번답 >> ");
			input[i] = sc.nextInt();
		}
		System.out.println("정답확인");
		for (i = 0; i < ans.length; i++) {	// 배열 ans과 배열 input의 인덱스 0부터 4까지 서로 비교하며 O X 출력 
			if(ans[i] == input[i]) {
				System.out.print("O ");
				sum += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.println("총 점 : " + sum);
		sc.close();
	}

}
