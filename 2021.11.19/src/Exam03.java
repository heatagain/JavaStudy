import java.util.Random;
import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// �������� �����ϱ�
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		int life = 3;

		System.out.println("PLUS GAME!!");
		// �����϶��� ���� ������ �ٽ� ����
		// �����϶��� ���ο� ������ ����

		while (life > 0) {
			int num1 = random.nextInt(5) + 1;
			int num2 = random.nextInt(5) + 1;

			while (life > 0) {
				System.out.print(num1 + " + " + num2 + " = ");
				int answer = sc.nextInt();
				int result = num1 + num2;

				if (answer == result) {
					System.out.println("�����Դϴ�!");
					break;
				} else {
					System.out.println("�����Դϴ�..");
					life = life - 1;
				}

			}

		}
		System.out.println("���� ��");
		sc.close();
	}

}
