import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {

		// Ű����κ��� ������ �Է¹ޱ�
		Scanner sc = new Scanner(System.in);

		/*System.out.print("���ڸ� �Է����ּ��� >> ");
		int i = sc.nextInt();
		System.out.println("��� : " + i);
		// ��� ���� �Է��ϵ��� �����ڸ� �Ʒ� ���� ������ ����Ͻÿ�
		// ��) 456 �Է� -> ��� : 400
		 * 
		 */
		
		System.out.print("�Է� >> ");
		int a = sc.nextInt();
		//int result = a / 100 * 100;
		String result = a / 100 + "00";
		System.out.println("��� : " + result );
		
		
	}

}
