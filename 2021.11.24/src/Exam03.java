import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {

		int i;
		Scanner sc = new Scanner(System.in);
		int[] ans = {1,4,3,2,1};
		int[] input = new int[5];
		int sum = 0;

		System.out.println("==ü���ϱ�==");
		System.out.println("���� �Է��ϼ���");
		for (i = 0; i < input.length; i++) {	// �迭 �ε��� 0������ 4���� ���ʴ�� �Է� ����
			System.out.print(i + 1 + "���� >> ");
			input[i] = sc.nextInt();
		}
		System.out.println("����Ȯ��");
		for (i = 0; i < ans.length; i++) {	// �迭 ans�� �迭 input�� �ε��� 0���� 4���� ���� ���ϸ� O X ��� 
			if(ans[i] == input[i]) {
				System.out.print("O ");
				sum += 20;
			} else {
				System.out.print("X ");
			}
		}
		System.out.println("�� �� : " + sum);
		sc.close();
	}

}
