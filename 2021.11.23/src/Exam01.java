import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {

		// ��� ���ϱ�
		int num;
		int i;
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		num = sc.nextInt();

		for (i = 1; i <= num; i++) {	// 1���� num ���� ����
			if (num % i == 0) {	// num�� i�� ������ �� �������� 0�̸�
				System.out.print(i);	// i�� ���
				if (i != num) {	// i�� num�� ���� ���� ������ ��ǥ ���
					System.out.print(", ");
				}
			}
		}
		sc.close();
	}
}
