
public class Exam02 {

	public static void main(String[] args) {
		// while�� Ȱ���Ͽ� 1���� 100���� ������ 3�� ����� ���

		int i = 2;
		int j = 0;

		while (i <= 100) {

			j = i % 3;
			if (j == 0) {
				System.out.println(i);
			}
			i++;
		}

	}

}
