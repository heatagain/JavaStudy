import java.util.Arrays;

public class Exam01 {

	public static void main(String[] args) {

		// ������ �迭�� ����
		// �ڷ���[][] �迭�� = new �ڷ���[ù��° ��][�ι�° ��]

		// 5�� 5���� �迭 �����ϱ�
		int[][] array = new int[5][5];

		// 1. �迭�� ������ �� �����ϱ�

//		array[0][0] = 1;
//		array[0][1] = 2;
//		array[0][2] = 3;
//		array[0][3] = 1;
//		array[0][4] = 2;

//		array[1][0] = 3;
//		array[1][1] = 7;

		// �ϳ��� ���� �����Ǵ� ���� ���
		int num = 1;

		// �迭�� �ս��� �����ϱ� ���� ���� for�� Ȱ���ϱ�
		// ��(��)�� �ݺ����� �� �ִ� for�� �ۼ�
		for (int i = 0; i < array.length; i++) {
			// ��(���� ȣ��)�� �ݺ����� �� �ִ� for�� �ۼ�
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = num;
				num++;
			}
		}

		// 2. �迭�� ���� �� Ȯ���ϱ� -> ���� for�� ���
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
