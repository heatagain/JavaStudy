import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. 학생 한명의 자바, db, 파이썬 점수를 입력하여 배열에 저장
//		int java = sc.nextInt();
//		int db = sc.nextInt();
//		int python = sc.nextInt();
		
		int[] score = new int[3];
		
		score[0] = sc.nextInt();
		score[1] = sc.nextInt();
		score[2] = sc.nextInt();
		
		// for~each 문 확장 for문 -> 배열, ArrayList 다룰때
		for(int s : score) {
			System.out.println(s);
			
		}
		
		System.out.println(Arrays.toString(score));
		
		// 4. 총점 출력
		int sum = 0;
				
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum);
		System.out.println(Arrays.stream(score).sum());
		
		// 5. 평균출력
		System.out.println("평균 : " + String.format("%.2f", (sum/(double)score.length)));
		
		
		
	}

}
