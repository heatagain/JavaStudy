import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("ù��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° ���� �Է� >> ");
		int num2 = sc.nextInt();

		int result = close10(num1, num2);
		System.out.println("10�� ����� �� : " + result);

	}

	public static int close10(int x1, int x2) {

//		int dev = 10 - x1;
//		if (dev < 0) {
//			dev *= -1;
//		}
//		//dev = dev > 0 ? dev : dev * -1;
//		
//		int dev2 = 10 - x2;
//		if (dev2 < 0) {
//			dev2 *= -1;
//		}
//		// dev2 = dev2 > 0 ? dev2 : dev2 * -1;
		
		// math class�� �ִ� abs() ���밪 �Լ� ����ϱ�
		int a = Math.abs(10 - x1);
		int b = Math.abs(10 - x2);

		if (a < b) {
			return x1;
		} else if (a > b) {
			return x2;
		} else {
			return 0;
		}

	}

}
