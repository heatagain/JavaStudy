import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1. �л� �Ѹ��� �ڹ�, db, ���̽� ������ �Է��Ͽ� �迭�� ����
//		int java = sc.nextInt();
//		int db = sc.nextInt();
//		int python = sc.nextInt();
		
		int[] score = new int[3];
		
		score[0] = sc.nextInt();
		score[1] = sc.nextInt();
		score[2] = sc.nextInt();
		
		// for~each �� Ȯ�� for�� -> �迭, ArrayList �ٷ궧
		for(int s : score) {
			System.out.println(s);
			
		}
		
		System.out.println(Arrays.toString(score));
		
		// 4. ���� ���
		int sum = 0;
				
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println(sum);
		System.out.println(Arrays.stream(score).sum());
		
		// 5. ������
		System.out.println("��� : " + String.format("%.2f", (sum/(double)score.length)));
		
		
		
	}

}
