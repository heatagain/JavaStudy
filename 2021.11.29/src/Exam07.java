import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� >> ");
		int num1 = sc.nextInt();

		System.out.print("�ι� ° ���� >> ");
		int num2 = sc.nextInt();

		System.out.print("������ �Է�(+, -, *, /) >> ");
		String op = sc.next();

		System.out.println("����� : " + cal(num1, num2, op));

	}

	public static int cal(int num1, int num2, String op) {

		// ����� ���� �� �ִ� ���� ����

		// ������ ���ϱ�
		if (op.equals("-")) {
			// ���꿡 ���� �۾� ����
			return num1 - num2;

		} else if (op.equals("*")) {
			return num1 * num2;

		} else if (op.equals("+")) {
			return num1 + num2;

		} else if (op.equals("/")) {
			return num1 / num2;

		} else {
			return 0;
		}
	}

//	public static int cal(int x1, int x2, char op) {
//		
//		if(op == '-') {
//			return x1 - x2;
//		} else {
//			return x1 * x2;
//		}
//	}

}
