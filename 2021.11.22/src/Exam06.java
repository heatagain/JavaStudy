
public class Exam06 {

	public static void main(String[] args) {

		// ������ ����� 2

		char star = '*';

		for (int i = 1; i <= 5; i++) {	// �� �ٲ� for��
			for (int j = 5; j >= i; j--) {	// *��� for�� (5���� �����ؼ� j���� 1���� ũ�ų� ���� ������)
				System.out.print(star);
			}
			System.out.println();
		}

	}

}
