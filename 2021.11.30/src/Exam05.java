import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int num = sc.nextInt();

		// num�� ����� ���� �հ�
		int result = getSumOfDivisors(num);

		System.out.println(num + "�� ����� �� : " + result);

		// num�� ������� ���
		getDivisor(num);

	}

	public static void getDivisor(int num) {

		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	public static int getSumOfDivisors(int num) {
		int sum = 0;
		// �� �ڽű����� ����� ���� ��
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		// �ش��ϴ� ����� ���ؼ� �հ� ���ϱ�
		return sum;
	}

}
