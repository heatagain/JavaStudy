
public class Exam01 {

	public static void main(String[] args) {

		// ������ �迭
		int[][] numArray = new int[3][5];
		int num = 1;
		numArray[1][2] = 3;
		numArray[2][4] = 10;
		// �Էº�
		for (int j = 0; j < numArray.length; j++) {
			for (int i = 0; i < numArray[0].length; i++) {

				numArray[j][i] = num;
				num++;
			}

		}

		// ��º�
		for (int j = 0; j < numArray.length; j++) {
			// ���� ���
			for (int i = 0; i < numArray[0].length; i++) {
				System.out.print(numArray[j][i] + " ");
			}
			System.out.println();	// ���� ��� �ɶ����� �ٹٲ�

		}

	}

}
