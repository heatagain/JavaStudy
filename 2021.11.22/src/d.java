
public class d {

	public static void main(String[] args) {

		int i;
		int j;
		int k;

		for (i = 1; i <= 5; i++) { // �ٹٲ� for��

			for (j = 5; j > i; j--) { // ������� for��
				System.out.print(" ");
			}
			for (k = 1; k <= j; k++) {	// * ��� for��
				System.out.print("*");
			}
			System.out.println();

		}

	}

}
