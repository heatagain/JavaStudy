
public class Exam02 {

	public static void main(String[] args) {

		int i;
		int j = 2;

		for (j = 2; j <= 30; j++) {	// 2���� 30���� �����ϴ� j
			System.out.print(j + "�� ��� : ");	// j�� ��� ���

			for (i = 1; i <= j; i++) {	// i���� j �ڽű��� ����
				if (j % i == 0) {
					System.out.print(i + " ");
				}
			}
			System.out.println();
		}

	}

}
